class Produk {
  final int id;
  final int idkategori;
  final String judul;
  final String harga;
  final String hargax;
  final String thumbnail;
 
  Produk({this.id,this.idkategori,this.judul,this.harga,this.hargax,this.thumbnail});
 
  factory Produk.fromJson(Map<String, dynamic> json) {
    return Produk(
      id: json['id'] as int,
      idkategori: json['idkategori'] as int,
      judul: json['judul'] as String,
      harga: json['harga'] as String,
      hargax: json['hargax'] as String,
      thumbnail: json['thumbnail'] as String
    );
  }
  Map<String, dynamic> toMap() {
    Map<String, dynamic> map = Map<String, dynamic>();
    map['id'] = id;
    map['idkategori'] = idkategori;
    map['judul'] = judul;
    map['harga'] = harga;
    map['hargax'] = hargax;
    map['thumbnail'] = thumbnail;
    return map;
  }
}