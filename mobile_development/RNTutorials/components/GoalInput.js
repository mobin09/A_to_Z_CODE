import { useState } from 'react';
import {View, TextInput, Button, StyleSheet, Modal, Image} from 'react-native';





function GoalInput(props){
    const [text, setText] = useState('');

    function  textHandler(enteredText){
       setText(enteredText);
    }

   function submitFunction(){
     props.handleSubmitfn(text);
     props.closeModel();
     setText('');
   }
    return(
      <Modal visible = {props.isVisible} animationType='slide'>
        
        <View style={styles.inputContainer}>
          <View style={styles.imgContainer}>
        <Image style={styles.imgStyle} source={require('../assets/images/goal.png')} />
        </View>
                  <TextInput 
                      style = {styles.textStyle} 
                      placeholder='Please Enter List'
                      onChangeText={textHandler}
                      value={text}
                      />
                  <View style={styles.buttonContainer}>    
                    <View style={styles.button}>
                        <Button title='Add Goal' onPress={submitFunction} color='#5e0acc'/>
                    </View>
                    <View style={styles.button}>
                      <Button title='Cancel' onPress={props.closeModel} color='#f31282'/>  
                    </View> 
                      
                  </View>       
        </View>
        </Modal>
    );
}

export default GoalInput;

const styles = StyleSheet.create({
    inputContainer: {
      flex:1,
      flexDirection: 'column',
      justifyContent: 'center',
      alignItems:'center',
      padding:16,
      backgroundColor: '#311b6b'    
    },
    textStyle:{
      borderWidth:1,
      borderColor: '#cccccc',
      width: '100%',
      marginRight:8,
      padding:16,
      color:'white',
      borderRadius:6
    },
    buttonContainer: {
      flexDirection: 'row',
      marginVertical: 16
    },
    button:{
      marginHorizontal:8,
      width:100,

    },
    imgStyle: {
      width: 100,
      height:100,
      borderRadius:50
      
      
    },
    imgContainer:{
       marginVertical: 16,
        justifyContent: 'center',
      alignItems:'center'
    }
});