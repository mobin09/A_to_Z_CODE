import React, { useEffect, useRef } from 'react';
import { Animated, StyleSheet, View } from 'react-native';

const FloatingCircle = ({ size, left, delay }) => {
  const translateY = useRef(new Animated.Value(0)).current;

  useEffect(() => {
    Animated.loop(
      Animated.sequence([
        Animated.timing(translateY, {
          toValue: -20,
          duration: 3000,
          delay,
          useNativeDriver: true
        }),
        Animated.timing(translateY, {
          toValue: 0,
          duration: 3000,
          useNativeDriver: true
        })
      ])
    ).start();
  }, []);

  return (
    <Animated.View
      style={[
        styles.circle,
        {
          width: size,
          height: size,
          borderRadius: size / 2,
          left,
          transform: [{ translateY }]
        }
      ]}
    />
  );
};

export default function AnimatedBackground() {
  return (
    <View style={StyleSheet.absoluteFill} pointerEvents="none">
      <FloatingCircle size={120} left={-30} delay={0} />
      <FloatingCircle size={180} left={200} delay={800} />
      <FloatingCircle size={90} left={100} delay={1500} />
    </View>
  );
}

const styles = StyleSheet.create({
  circle: {
    position: 'absolute',
    top: 150,
    backgroundColor: 'rgba(59,130,246,0.15)' // soft blue
  }
});
