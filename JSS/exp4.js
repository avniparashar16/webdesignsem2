function calculateGrade(){
    let n=document.getElementById("subjects").value;
    let total=0;
    for(let i=1;i<=n;i++){
        let marks=parsefloat(prompt("Enter marks for subject "+i));
        total+=marks;
    }
    document.getElementById("result").innerHTML="The sum of first "+n+" natural numbers is: "+result;
}

let average=total/n;
let grade;
let result;
if(average>=90){
    grade="A+";

}
else if(average>=70){
    grade="B+";
}
else if(average>=50){
    grade="C+";
}
else{
    grade="D";
}

if (average>=40){
    result="Pass";
}
else{
    result="Fail";
}
document.getElementById("result").innerHTML="The average marks is: "+average+"<br>"+"Grade: "+grade+"<br>"+"Result: "+result;
