

import { initializeApp } from "firebase/app";
import { initializeAuth, getReactNativePersistence } from "firebase/auth";
import { getFirestore } from "firebase/firestore";
import AsyncStorage from "@react-native-async-storage/async-storage";


const firebaseConfig = {
  apiKey: "AIzaSyC6dYt1JIY2Dv-se4fYtsyNGa7Gy6AYPwc",
  authDomain: "myhabit-tracker-cb4ea.firebaseapp.com",
  projectId: "myhabit-tracker-cb4ea",
  storageBucket: "myhabit-tracker-cb4ea.appspot.com",
  messagingSenderId: "1083987801989",
  appId: "1:1083987801989:web:8b05206e06ad36f043f6ec",
};

const app = initializeApp(firebaseConfig);
// 🔐 Authentication
export const auth = initializeAuth(app, {
  persistence: getReactNativePersistence(AsyncStorage),
});
// 🗄 Firestore Database
export const db = getFirestore(app);
