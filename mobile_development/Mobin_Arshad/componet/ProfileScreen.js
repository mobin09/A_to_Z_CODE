
import React, { useEffect, useRef, useState } from 'react';
import {
  View,
  Text,
  StyleSheet,
  Image,
  ScrollView,
  Animated,
  TouchableOpacity
} from 'react-native';

import SocialLink from './SocialLinks';


export default function ProfileScreen() {

  // 🌗 Theme state
  const [isDark, setIsDark] = useState(true);
  const theme = isDark ? darkTheme : lightTheme;

  // 🎬 Animations
  const scaleAnim = useRef(new Animated.Value(0)).current;
  const fadeAnim = useRef(new Animated.Value(0)).current;

  useEffect(() => {
    Animated.parallel([
      Animated.spring(scaleAnim, {
        toValue: 1,
        useNativeDriver: true
      }),
      Animated.timing(fadeAnim, {
        toValue: 1,
        duration: 700,
        useNativeDriver: true
      })
    ]).start();
  }, []);

  return (
    <ScrollView style={[styles.container, { backgroundColor: theme.bg }]}>

      {/* HERO */}
      <View style={[styles.hero, { backgroundColor: theme.card }]}>
        <Text style={[styles.headerTitle, { color: theme.subText }]}>
          PROFILE
        </Text>

        {/* AVATAR + EDIT */}
        <View style={styles.avatarWrapper}>
          <Animated.Image
            source={{ uri: 'https://drive.google.com/uc?export=view&id=1HGRW9lrijXL4ElMG7xaBMRzBjPH6wJTb'}}
            style={[
              styles.avatar,
              { transform: [{ scale: scaleAnim }] }
            ]}
          />

          <TouchableOpacity style={styles.editBtn}>
            <Text style={{ color: '#fff' }}>✎</Text>
          </TouchableOpacity>
        </View>

        <Text style={[styles.name, { color: theme.text }]}>
          Mobin Arshad
        </Text>
        <Text style={{ color: theme.subText }}>
          Software Engineer
        </Text>
        <Text style={{ color: theme.subText }}>
          📍 India
        </Text>

        {/* STATS */}
        <View style={styles.stats}>
          <Stat label="Favorited" value="116" />
          <Stat label="Views" value="116" />
        </View>
      </View>

      {/* BIO */}
      <Animated.View
        style={[
          styles.section,
          { opacity: fadeAnim }
        ]}
      >
        <Text style={[styles.bio, { color: theme.text }]}>
          Backend, Mobile Developer, Front-End with strong experience in Java,
          Spring Boot, Spring, Microservices, AWS, Devops, React and React Native.
        </Text>
      </Animated.View>

      {/* ACTIONS */}
      <View>
        <SocialLink />
      </View>

      {/* SKILLS
      <View style={styles.section}>
        <Text style={[styles.sectionTitle, { color: theme.text }]}>
          SKILLS
        </Text>

        <View style={styles.skills}>
          {['Java', 'Spring Boot', 'MicroService', 'SQL',
          'React Native', 'AWS', 'System Design', 
          'React', 'Data Structure', 'Gen AI',
          'DevOps', 'UI UX'
          ]
            .map(skill => (
              <View key={skill} style={styles.skillChip}>
                <Text style={styles.skillText}>{skill}</Text>
              </View>
            ))}
        </View>
      </View> */}

      {/* PROJECTS */}
      <View style={styles.section}>
          <Text style={[styles.sectionTitle, { color: theme.text }]}>
          PROJECT
        </Text>
        <Image
            source={{ uri: 'https://streak-stats.demolab.com/?user=mobin09' }}
            style={{ width: '100%', height: 150 }}
            resizeMode="contain"/>

      </View>
      {/* LINKS */}
      <View style={styles.section}>
        <Text style={[styles.sectionTitle, { color: theme.text }]}>
          LINKS
        </Text>

        <View style={styles.links}>
          <LinkIcon text="🌐" />
          <LinkIcon text="in" />
          <LinkIcon text="🐙" />
        </View>
      </View>

      {/* THEME TOGGLE */}
      <TouchableOpacity
        style={styles.themeToggle}
        onPress={() => setIsDark(!isDark)}
      >
        <Text style={{ fontSize: 18 }}>
          {isDark ? '🌞' : '🌙'}
        </Text>
      </TouchableOpacity>

    </ScrollView>
  );
}

/* ---------- SMALL COMPONENTS ---------- */

const Stat = ({ label, value }) => (
  <View style={{ alignItems: 'center' }}>
    <Text style={styles.statNumber}>{value}</Text>
    <Text style={styles.statLabel}>{label}</Text>
  </View>
);

const ActionIcon = ({ text }) => (
  <View style={styles.iconCircle}>
    <Text>{text}</Text>
  </View>
);

const LinkIcon = ({ text }) => (
  <View style={styles.linkIcon}>
    <Text>{text}</Text>
  </View>
);

/* ---------- THEMES ---------- */

const lightTheme = {
  bg: '#ffffff',
  card: '#f1f5f9',
  text: '#0f172a',
  subText: '#475569'
};

const darkTheme = {
  bg: '#020617',
  card: '#1e293b',
  text: '#e5e7eb',
  subText: '#94a3b8'
};

/* ---------- STYLES ---------- */

const styles = StyleSheet.create({
  container: {
    flex: 1
  },

  hero: {
    alignItems: 'center',
    paddingVertical: 40,
    borderBottomLeftRadius: 40,
    borderBottomRightRadius: 40
  },

  headerTitle: {
    marginBottom: 10
  },

  avatarWrapper: {
    position: 'relative',
    marginBottom: 10
  },

  avatar: {
    width: 120,
    height: 120,
    borderRadius: 60,
    borderWidth: 4,
    borderColor: '#fff'
  },

  editBtn: {
    position: 'absolute',
    right: 0,
    bottom: 5,
    width: 36,
    height: 36,
    borderRadius: 18,
    backgroundColor: '#f97316',
    alignItems: 'center',
    justifyContent: 'center'
  },

  name: {
    fontSize: 22,
    fontWeight: 'bold'
  },

  stats: {
    flexDirection: 'row',
    width: '70%',
    justifyContent: 'space-between',
    marginTop: 15
  },

  statNumber: {
    color: '#22c55e',
    fontSize: 18,
    fontWeight: 'bold'
  },

  statLabel: {
    color: '#94a3b8',
    fontSize: 12
  },

  section: {
    padding: 20
  },

  bio: {
    textAlign: 'left',
    lineHeight: 20,
  },

//   actions: {
//     flexDirection: 'row',
//     justifyContent: 'space-around'
//   },

  iconCircle: {
    width: 50,
    height: 50,
    borderRadius: 25,
    backgroundColor: '#e5e7eb',
    alignItems: 'center',
    justifyContent: 'center'
  },

  sectionTitle: {
    fontWeight: 'bold',
    marginBottom: 10
  },

  skills: {
    flexDirection: 'row',
    flexWrap: 'wrap'
  },

  skillChip: {
    backgroundColor: '#2dd4bf',
    paddingHorizontal: 14,
    paddingVertical: 6,
    borderRadius: 20,
    margin: 5
  },

  skillText: {
    color: '#fff'
  },

  links: {
    flexDirection: 'row',
    justifyContent: 'space-around'
  },

  linkIcon: {
    width: 45,
    height: 45,
    borderRadius: 22,
    backgroundColor: '#e5e7eb',
    alignItems: 'center',
    justifyContent: 'center'
  },

  themeToggle: {
    alignSelf: 'center',
    marginBottom: 30
  }
});
