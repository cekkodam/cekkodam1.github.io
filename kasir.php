<?php
  // Set your email address
  $to = 'farhanrisqi17@gmail.com';

  // Get the data from the form
  $nama = $_POST['PLU'];
  $email = $_POST['harga'];
  $pesan = $_POST['bayar'];

  // Create the email subject and body
  $subject = 'Data from Website';
  $body = "Nama: $nama\nEmail: $email\nPesan: $pesan";

  // Send the email using PHP's mail function
  mail($to, $subject, $body);

  // Redirect the user to a thank you page
  header('Location: thank_you.html');
  exit;
?>