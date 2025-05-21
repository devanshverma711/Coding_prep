console.log("My name is Devil");

let fetchbtn = document.getElementById("fetchbtn");
fetchbtn.addEventListener('click',buttonClickHandler);

function buttonClickHandler(){
    console.log("You have clicked the button");
    const xhr = new XMLHttpRequest();

   // xhr.open('GET','https://jsonplaceholder.typicode.com/todos/1',true);
    xhr.open('POST','https://dummy.restapiexample.com/api/v1/create',true);
    xhr.getResponseHeader('Content-type','application/x-www-form-urlencoded');
    xhr.onprogress = function(){
        console.log('On progress');
    }

    xhr.onload = function(){
        if(this.status===200){
            console.log(this.responseText);
        }
        else{
            console.log("Some error occured");
        }
        
    }
    params=`	{"name":"test1","salary":"123","age":"23"}`
    xhr.send(params);

    console.log("is it taking long");
}
