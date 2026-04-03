import React from 'react';
import { View, Text, StyleSheet, ScrollView, TouchableOpacity } from 'react-native';
import { useNavigation } from '@react-navigation/native';

export default function SkillsScreen() {
  const navigation = useNavigation();

  const skills = {
    Backend: ['Java', 'Spring Boot', 'Microservices', 'Hibernate'],
    Frontend: ['React Native', 'React', 'JavaScript'],
    DevOps: ['Docker', 'AWS', 'GitHub Actions'],
    Database: ['MySQL', 'PostgreSQL', 'MongoDB']
  };

  return (
    <View style={styles.container}>

      {/* HEADER */}
      <View style={styles.header}>
        <TouchableOpacity onPress={() => navigation.goBack()}>
          <Text style={styles.back}>← Back</Text>
        </TouchableOpacity>
        <Text style={styles.title}>My Skills</Text>
      </View>

      <ScrollView contentContainerStyle={{ padding: 20 }}>
        {Object.keys(skills).map(category => (
          <View key={category} style={styles.card}>
            <Text style={styles.category}>{category}</Text>

            <View style={styles.skillRow}>
              {skills[category].map(skill => (
                <View key={skill} style={styles.skillChip}>
                  <Text style={styles.skillText}>{skill}</Text>
                </View>
              ))}
            </View>
          </View>
        ))}
      </ScrollView>
    </View>
  );
}


const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff'
  },

  header: {
    paddingTop: 50,
    paddingBottom: 15,
    paddingHorizontal: 20,
    backgroundColor: '#1e293b'
  },

  back: {
    color: '#38bdf8',
    marginBottom: 5
  },

  title: {
    fontSize: 22,
    fontWeight: 'bold',
    color: '#fff'
  },

  card: {
    marginBottom: 20
  },

  category: {
    fontSize: 18,
    fontWeight: 'bold',
    marginBottom: 10
  },

  skillRow: {
    flexDirection: 'row',
    flexWrap: 'wrap'
  },

  skillChip: {
    backgroundColor: '#2dd4bf',
    paddingHorizontal: 14,
    paddingVertical: 8,
    borderRadius: 20,
    margin: 5
  },

  skillText: {
    color: '#fff'
  }
});
