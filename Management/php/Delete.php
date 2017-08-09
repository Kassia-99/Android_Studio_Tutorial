<?php
  $con = mysqli_connect("localhost", "lazytitan", "xodid001", "lazytitan");

  $userID = $_POST["userID"];

  $statement = mysqli_prepare($con, "delete from USER where userID = ?");
  mysqli_stmt_bind_param($statement, "s", $userID);
  mysqli_stmt_execute($statement);

  $response = array();
  $response["success"] = true;

  echo json_encode($response);
?>
