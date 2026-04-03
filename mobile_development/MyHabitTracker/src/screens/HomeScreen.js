import { View, Text, Button, StyleSheet} from "react-native";
import { auth } from "../services/firebase";
import { signOut } from "firebase/auth";



function HomeScreen({navigation}){

    const handleLogout = async ()=>{
         await signOut(auth);
         navigation.replace("Login");
    }

    return (
           <View style={styles.container}>
               <Text style={styles.title}>Welcome to MyHabit Tracker</Text>
               <Button title="Logout" onPress={handleLogout} />
           </View>
    );
}
export default HomeScreen;

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },
  title: {
    fontSize: 20,
    marginBottom: 20,
  },
});