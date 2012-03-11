function redirectToEditContact() {  
	window.location = this.options[this.selectedIndex].value + '.htm';
}  
function deleteContact(){
	window.location = 'delete.htm?delName='+ document.getElementById("meow").name.value;
}

var el = document.getElementById("formList");   
el.addEventListener("click", redirectToEditContact, false);
