document.getElementById('lgn').addEventListener('click', (e) => {

    e.preventDefault()

    user_name=document.getElementById('uname').value
   
    user_password = document.getElementById('pwd').value
    console.log(user_name);
    window.localStorage.setItem("my-email",user_name)
    
    console.log(user_name);
    console.log(user_password);

   

    const xhr = new XMLHttpRequest()
    url = 'http://localhost:8082/users'
    xhr.open('GET', url)
    xhr.setRequestHeader('Access-Control-Allow-Origin','*')
    xhr.setRequestHeader('Content-Type', 'application/json')
    // window.localStorage.setItem("my-email",email1)
    xhr.onreadystatechange = () => {
        if (xhr.readyState == 4 && xhr.status == 200) {
           res=JSON.parse(xhr.responseText)
           console.log(res);
           for (let i = 0; i < res.length; i++)
           {
                if (res[i].username==user_name && res[i].password==user_password )
                {
                    // document.getElementById('search').innerHTML='<a href="./search></a> '.
                    window.location.href="http://localhost:5501/search.html"
                   console.log("success");
                   break;
                   
                    
                }
                // (res[i].username!=user_name && res[i].password!=user_password)
                else
                {
                   document.getElementById('messages').innerHTML="incorrect"
                   console.log('incorrect')

                }

           
           }

        }
    }
 
    xhr.send()
    
})