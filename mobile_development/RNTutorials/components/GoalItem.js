import {StyleSheet, View, Text, Pressable} from 'react-native'

function GoalItem(props){

    return ( 
        <View style = {styles.styleGoal}>
          <Pressable 
             onPress={props.deleteFn.bind(this, props.id)}
             style={({pressed})=> pressed && styles.pressedStyle}   
             >        
            <Text style = {styles.styleGoatText}>{props.dataVal}</Text>
          </Pressable>
        </View>

    );       
}


export default GoalItem;

const styles = StyleSheet.create({
    styleGoal :{
      margin:8,
      backgroundColor: '#5e0acc',
      borderRadius: 5,
    },
    pressedStyle: {
        opacity:0.5,
        backgroundColor:'red'
    },
    styleGoatText: {
        color:'white',
         padding:8,
    }
})