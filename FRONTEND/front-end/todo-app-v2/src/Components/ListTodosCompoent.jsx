import { useEffect, useState } from "react";
import { getAlltodos } from "./API/HelloWorldApiService";
import { deleteTodoList } from "./API/TodosAPI";

function ListTodosComponent() {

    const today = new Date();
    const targetDate = new Date(today.getFullYear() + 2, today.getMonth(), today.getDay());

     const[todos, setTodos] = useState([]);
     const[deleteMessage, setDeleteMessage] = useState(null);
     
    function todosList(){
        getAlltodos("dummy")
           .then((response)=> successResponse(response))
           .catch((error) => errorResponse(error))
           .finally(()=> console.log("Clean UP Code here"))
    }

    function successResponse(response){
        console.log(response.data);
        setTodos(response.data);  
    }

    function errorResponse(error){
        console.log(error);
    }

    useEffect(()=>{
        todosList();
    }, []);


    function deleteTodo(id){
        deleteTodoList("dummy", id)
            .then((response)=>  succesDeleteTodo(response, id))
            .catch((error) => erorrDeleteTodo(error))
            .finally(()=> console.log("Clean UP codes"))
        console.log("Delete Todo Called" + id);
    }

    function succesDeleteTodo(response, id){
        console.log(response);
        console.log("id is id id id id id::::::::::" + id);
        setDeleteMessage(`Deleted Sucessfully with the id::: ${id}`);
        todosList();
    }

    function erorrDeleteTodo(error){
        console.log(error);
    }


   


    return(
        <div className="container">
            <h1>What you want to do ??</h1>
            {deleteMessage && <div className="alert alert-warning">{deleteMessage}</div>}          
            <div>
               <table className="table">
                   <thead>
                       <tr>
                           <th>ID</th>
                           <th>Description</th>
                           <th>Is Done</th>
                           <th>Target Date</th>
                           <th>Delete</th>
                       </tr>
                   </thead>
                   <tbody>
                      
                        {
                            todos.map(todo =>(
                                <tr key={todo.id}>
                                  <td>{todo.id}</td>
                                  <td>{todo.description}</td>
                                  <td>{todo.done.toString()}</td>
                                  <td>{todo.targetDate}</td>
                                  <td><button className="btn btn-danger" onClick={()=> deleteTodo(todo.id)}>Delete</button></td>
                                </tr>
                            ))
                        }
                          
                   </tbody>
               </table>
            </div>
        </div>
    );
}

export default ListTodosComponent;