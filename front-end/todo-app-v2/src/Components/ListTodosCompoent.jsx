import { useEffect, useState } from "react";
import { getAlltodos } from "./API/HelloWorldApiService";

function ListTodosComponent() {

    const today = new Date();
    const targetDate = new Date(today.getFullYear() + 2, today.getMonth(), today.getDay());

     const[todos, setTodos] = useState([]);

     
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

    return(
        <div className="container">
            <h1>What you want to do ??</h1>
            <div>
               <table className="table">
                   <thead>
                       <tr>
                           <th>ID</th>
                           <th>Description</th>
                           <th>Is Done</th>
                           <th>Target Date</th>
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