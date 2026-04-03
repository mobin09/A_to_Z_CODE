import React from 'react';
import {
  View,
  TouchableOpacity,
  Linking,
  StyleSheet
} from 'react-native';

// ✅ EXPO ICONS (most likely you are using Expo)
import { FontAwesome, MaterialCommunityIcons } from '@expo/vector-icons';

const SocialLinks = () => {

  const openLink = (url) => {
    Linking.openURL(url);
  };

  return (
    <View style={styles.socialRow}>

      {/* WhatsApp */}
      <TouchableOpacity
        style={styles.iconBox}
        onPress={() => openLink('https://wa.me/918810316541')}
      >
        <FontAwesome name="whatsapp" size={26} color="#25D366" />
      </TouchableOpacity>

      {/* LinkedIn
      <TouchableOpacity
        style={styles.iconBox}
        onPress={() => openLink('https://www.linkedin.com/in/your-linkedin')}
      >
        <FontAwesome name="linkedin" size={26} color="#0A66C2" />
      </TouchableOpacity> */}

      {/* Gmail */}
      <TouchableOpacity
        style={styles.iconBox}
        onPress={() => openLink('mailto:yourmail@gmail.com')}
      >
        <MaterialCommunityIcons name="gmail" size={26} color="#EA4335" />
      </TouchableOpacity>

      {/* GitHub
      <TouchableOpacity
        style={styles.iconBox}
        onPress={() => openLink('https://github.com/your-github')}
      >
        <FontAwesome name="github" size={26} color="#000" /> */}
      {/* </TouchableOpacity> */}

    </View>
  );
};

export default SocialLinks; // ✅ THIS WAS MISSING

const styles = StyleSheet.create({
  socialRow: {
    flexDirection: 'row',
    justifyContent: 'center',
    paddingVertical: 20
  },

  iconBox: {
    width: 40,
    height: 40,
    borderRadius: 20,
    backgroundColor: '#f1f5f9',
    alignItems: 'center',
    justifyContent: 'center',
    elevation: 3,
    margin: 5
  }
});
