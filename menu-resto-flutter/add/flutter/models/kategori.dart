class Kategori {
  final int id;
  final String nama;
 
  Kategori({this.id,this.nama});
 
  factory Kategori.fromJson(Map<String, dynamic> json) {
    return Kategori(
      id: json['id'] as int,
      nama: json['nama'] as String
    );
  }
  Map<String, dynamic> toMap() {
    Map<String, dynamic> map = Map<String, dynamic>();
    map['id'] = id;
    map['nama'] = nama;
    return map;
  }
}