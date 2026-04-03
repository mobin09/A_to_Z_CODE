import { useState } from 'react';
import { 
  StyleSheet, 
  Text, 
  TextInput, 
  View, 
  Button,
  ScrollView,
  FlatList

} from 'react-native';

import GoalItem from './components/GoalItem';
import GoalInput from './components/GoalInput';

export default function App() {
  const [arr, setArr] = useState([]);


  function handleSubmit(textInput){
    if(textInput.length != 0){
       setArr(prev => [...prev, {text: textInput, id: Math.random().toString()}]);
    }
  }

  function deleteItem(id){
    setArr(item => {
      return item.filter((goalItem) => goalItem.id != id);
    });

  }

  const [modelVal, setModelVal] = useState(false);

  function openModleHandler(){
    setModelVal(true);
  }

  function closeModelHandler(){
    setModelVal(false);
  }


  return (
    <View style={styles.AppContainer}>
        <Button 
             title='Add New Goal!'
             color='#5e0acc'
             onPress={openModleHandler}
             />
       { modelVal && <GoalInput closeModel = {closeModelHandler} isVisible = {modelVal} handleSubmitfn={handleSubmit}/> }
        <View style = {styles.goalContainer}>
          <FlatList data={arr} renderItem={ (itemData) =>{
                return (
                   <GoalItem id={itemData.item.id} dataVal = {itemData.item.text}  deleteFn = {deleteItem}/>
                );
          }}
          keyExtractor={(item, index) => {
            return item.id;
          }}
          />
        </View>
   </View>
  );
}
const styles = StyleSheet.create({
    AppContainer: {
      flex:1,
      paddingTop: 50,
      paddingHorizontal: 20
    },
    
    goalContainer: {
      flex: 5
    },
    

});
