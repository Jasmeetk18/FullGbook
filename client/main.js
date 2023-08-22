document.getElementById('btn').addEventListener('click',(e)=>{e.preventDefault()

const name1=document.getElementById('name').value
const user_name=document.getElementById('uname').value
const user_password=document.getElementById('pwd').value
const dob1=document.getElementById('dob').value
const email1=document.getElementById('email').value
const mob_no1=document.getElementById('MobNo').value
 
const user={
    name:name1,
    username:user_name,
    password:user_password,
    dob:dob1,
    email:email1,
    mob_no:mob_no1
}
console.log(user);
window.localStorage.setItem("my-email",user_name)

 const url= 'http://localhost:8082/users'
 const xhr= new XMLHttpRequest()
 xhr.open('POST',url)
 xhr.setRequestHeader('Content-Type','application/json')
 xhr.setRequestHeader('Access-Control-Allow-Origin','*')
  xhr.onreadystatechange=() =>{
    if(xhr.status===200 && xhr.readyState==4)  {
    // const response=JSON.parse(xhr.responseText);
      console.log(xhr.responseText)

     }
  }
  xhr.send(JSON.stringify(user));
  window.location.href="http://localhost:5501/search.html"

})