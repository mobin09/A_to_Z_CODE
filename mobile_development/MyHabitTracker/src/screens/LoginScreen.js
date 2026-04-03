import { useState, useEffect } from "react";
import {
  View,
  Text,
  TextInput,
  Button,
  StyleSheet,
  Alert,
} from "react-native";
import { auth } from "../services/firebase";
import {
  createUserWithEmailAndPassword,
  signInWithEmailAndPassword,
  onAuthStateChanged,
} from "firebase/auth";


export default function LoginScreen({navigation}){

    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [loading, setLoading] = useState("");

    //🔐 Auto-login if user already logged in
    useEffect(()=>{
     const unsubscribe = onAuthStateChanged(auth, (user) => {
      if (user) {
        navigation.replace("Home");
      }
      setLoading(false);
    });
  return unsubscribe;
}, []);


const handleSignup = async () => {
    if (!email || !password) {
      Alert.alert("Error", "Email and password are required");
      return;
    }

    try {
      await createUserWithEmailAndPassword(auth, email, password);
      navigation.replace("Home");
    } catch (error) {
        console.log(error.message);
      Alert.alert("Signup Error", error.message);
    }
  };

  const handleLogin = async () =>{
      if(!email || !password){
            Alert.alert("Error", "Email and password are required");
            return;
       }
    try {
        await signInWithEmailAndPassword(auth, email, password);
            navigation.replace("Home");
      }catch(error){
        console.log(error.message);
      Alert.alert("Login Error", error.message);
      }
  }
if (loading) {
    return (
      <View style={styles.container}>
        <Text>Loading...</Text>
      </View>
    );
  }

    return (
            <View style={styles.container}>
            <Text style={styles.title}>MyHabit Tracker</Text>

            <TextInput
                style={styles.input}
                placeholder="Email"
                autoCapitalize="none"
                keyboardType="email-address"
                value={email}
                onChangeText={setEmail}
            />

            <TextInput
                style={styles.input}
                placeholder="Password"
                secureTextEntry
                value={password}
                onChangeText={setPassword}
            />

            <View style={styles.button}>
                <Button title="Sign Up" onPress={handleSignup} />
            </View>

            <View style={styles.button}>
                <Button title="Login" onPress={handleLogin} />
            </View>
            </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    padding: 20,
  },
  title: {
    fontSize: 24,
    fontWeight: "bold",
    marginBottom: 20,
    textAlign: "center",
  },
  input: {
    borderWidth: 1,
    borderColor: "#ccc",
    padding: 12,
    marginBottom: 12,
    borderRadius: 6,
  },
  button: {
    marginBottom: 10,
  },
});