import axios from "axios";
const apiClinet = axios.create(
    {
       baseURL:"http://127.0.0.1:8080" 
    }
    );
export function getAlltodos(username){
    return apiClinet.get(`/users/${username}/todos`);
}


export function deleteTodoList(username, id){
    return apiClinet.delete(`/users/${username}/todos/${id}`);
}
