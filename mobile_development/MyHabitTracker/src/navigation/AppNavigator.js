import { NavigationContainer } from "@react-navigation/native";
import { createNativeStackNavigator } from "@react-navigation/native-stack";

import LoginScreen from '../screens/LoginScreen';
import HomeScreen from '../screens/HomeScreen';
import AddHabbitScreen from '../screens/AddHabitScreen';

const Stack = createNativeStackNavigator();

function AppNavigator(){
    return(
        <NavigationContainer>
            <Stack.Navigator>
               <Stack.Screen name="Login" component={LoginScreen} />
               <Stack.Screen name="Home" component={HomeScreen}/>
               <Stack.Screen  name="AddHabbit" component={AddHabbitScreen}/>
            </Stack.Navigator>
        </NavigationContainer>
    );
}

export default AppNavigator;