import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, View } from 'react-native';

import ProfileScreen from './componet/ProfileScreen';
import SkillsScreen from './componet/SkillsScreen';
import AnimatedBackground from './componet/AnimatedBackground';

const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <View style={styles.container}>
        <AnimatedBackground />

        <Stack.Navigator screenOptions={{ headerShown: false }}>
          <Stack.Screen name="Profile" component={ProfileScreen} />
          <Stack.Screen name="Skills" component={SkillsScreen} />
        </Stack.Navigator>

        {/* ✅ SAFE STATUS BAR */}
        {/* <StatusBar barStyle="dark-content" hidden={false} />       */}
      </View>
    </NavigationContainer>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    position: 'relative',
    backgroundColor: '#fff'
  }
});
