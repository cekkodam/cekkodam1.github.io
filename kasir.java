function hitungKembalian() {
  var PLU = document.getElementById("PLU").value;
	var harga = document.getElementById("harga").value;
	var bayar = document.getElementById("bayar").value;
	
	if (harga > 0 && bayar > 0) {
		var kembalian = bayar - harga;
		if (kembalian >= 0) {
			document.getElementById("kembalian").innerHTML = "Kembalian: Rp " + kembalian.toFixed(0);
		} else {
			document.getElementById("kembalian").innerHTML = "Uang tidak cukup!";
		}
	} else {
		document.getElementById("kembalian").innerHTML = "Masukkan harga dan bayar!";
	}
}