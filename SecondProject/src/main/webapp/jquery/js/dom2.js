/**
 * Dom2.js is javaScript file include into Dom.jsp
 *This is Array, have 2 element, every element is 1 other element 
	And for loop have "var i = 0; i < datatest.length; i++ ", if write "var i; ..." 
	is wrong and it will NOT RUN 
	Press key `` for enter down code
	And we creat a .js file to include dom2.jsp, if not do it, EROR !
	remember eror missing "/" inside "</td>"
 */

	var datatest = [["SJC", 5000, 10], ["BTMC",4700, 20]];
	$(function() {
		$("button").click(function() {
			for (var i = 0; i < datatest.length; i++) {
				var row = datatest[i];
				var tr = `<tr>
							<td>${i+1}</td>
							<td>${row[0]}</td>
							<td>${row[1]}</td>
							<td>${row[2]}</td>
							<td>
								<button onclick="$(this).parent().parent().remove()" class = "btn btn-danger">DEL</button>
							</td>
					      </tr>`;
				$("tbody").append(tr);
				console.log("This is Row index " + i, row);
				console.log("Row " + i, tr);
			}
		});
	});

 
 