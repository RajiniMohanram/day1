let employees = [];

function add(event){
	let id = document.forms['emp']['id'].value;
	let name = document.forms['emp']['fname'].value;
	let salary = document.forms['emp']['salary'].value;

	let emp = {"empId":id, "empName":name, "salary":salary};
	employees.push(emp);

	event.preventDefault();
}

function show(){
	let tbl = document.getElementById('emptbl');
	for(let i=0; i<employees.length; i++){
		let row = "<tr>";
		row += "<td>"+employees[i].empId+"</td>";
		row += "<td>"+employees[i].empName+"</td>";
		row += "<td>"+employees[i].salary+"</td>";
		row += "<td onclick='fill("+i+")'>Action</td>";
		row += "</tr>";
		tbl.innerHTML += row;
	}
}

function fill(index){
	document.forms['emp']['id'].value = employees[index].empId;
	document.forms['emp']['fname'].value = employees[index].empName;
	document.forms['emp']['salary'].value = employees[index].salary;
}