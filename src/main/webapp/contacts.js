function redirectToEditContact() {  
	if (this.selectedIndex == 0)
		window.location = 'lists.htm';
	else
		window.location = this.options[this.selectedIndex].value + '.htm';
}  
function deleteContact(){
	if (location.pathname != "/Contacts/lists.htm")
		window.location = 'delete.htm?delName='+ document.getElementById("meow").name.value;
}

var el = document.getElementById("formList");   
el.addEventListener("change", redirectToEditContact, false);
