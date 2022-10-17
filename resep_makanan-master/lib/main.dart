import 'package:flutter/material.dart';

import 'detail.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    home: MyApp(),
  ));
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.redAccent,
          title: Text("Resep Makanan"),
        ),
        body: _PageList());
  }
}
//class
class _PageList extends StatefulWidget {
  _PageStateListState createState() => _PageStateListState();
}

class _PageStateListState extends State<_PageList> {
  List<String> judul = [
    "Bubur Ayam",
    "Mie Goreng",
    "Mie Rebus",
    "Nasi Goreng",
    "Nugget",
    "Sosis Bakar",
    "Telor Ceplok"
  ];

  List<String> subjudul = [
    "Bubur yang hangat dengan paduan irisan ayam dan bumbu",
    "Mie yang rasanya enak dengan pembuatan yang mudah dan cepat",
    "Mie hangat dengan kaldunya yang membuat kita menjadi lebih segar",
    "Nasi yang digoreng diwajan dengan beberapa bumbu spesial",
    "Makanan siap jadi yang hanya butuh digoreng untuk menjadi siap makan",
    "Makanan siap makan yang dapat diolah dengan banyak cara",
    "Satu bahan yang dapat digunakan bermacam2"
  ];

  List<String> gambar = [
    "images/buryam.jpg",
    "images/mie goreng.jpg",
    "images/mie rebus.jpg",
    "images/nasgor.jpg",
    "images/nugget.jpg",
    "images/sosis.jpg",
    "images/telor ceplok.jpg"
  ];

  List<String> resep = [
    "Belilah SuperBubur di warung terdekat, sajikan di mangkok kesayangann anda tuang air panas secukupnya, tunggu beberapa menit, siap dihidangkan",
    "Pisahkan bumbu dengan mie dari kemasan, masukkan mie dalam rebusan, tunggu beberapa menit, tiriskan mie dari air rebusan, campurkan bumbu yang tadi dipisahkan lalu aduk, mie goreng siap disajikan",
    "Masukkan mie dan bumbu dalam rebusan, tunggu beberapa menit, tuang mie dengan air rebusan, mie rebus siap disajikan",
    "Masukkan nasi dalam wajan, masukkan juga beberapa bumbu, aduk terus hingga nasi rata akan bumbu, angkat nasi lalu hidangkan, dan jangan lupa tambahkan beberapa topping seperti kerupuk",
    "Ambillah beberapa nugget dari kemasan, siapkan wajan beserta minyak nya, gorenglah nugget di wajan yg telah disediakan, tunggu beberapa menit, tiriskan, lalu hidangkan lah nugget dengan sesuka hati",
    "Ambil sosis dari kemasan, siapkan alat panggangan, biarkan panggangan panas terlebih dahulu, buatlah pola pada sosis untuk kematangan yang sempurna, letakkan sosis pada pangganngan, tungggu beberapa menit, sosis siap dihidangkan",
    "Siapkan wajan dan juga minyak, panaskan minyak terlebih dahulu, setelah minyak panas ceplokkan telor pada wajan, tunggu hinga tekstur telor berubah, angkat dan telur siap dihidangkan"
  ];

  List<String> sampel = [
    "",
    "",
    "",
    "",
    "",
    "",
    "",
  ];

  @override
  Widget build(BuildContext context) {
    return Container(
      child: ListView.builder(
        itemCount: judul.length,
        itemBuilder: (BuildContext contex, int index) {
          final title = judul[index].toString();
          final subTitle = subjudul[index].toString();
          final img = gambar[index].toString();
          final sample = sampel[index].toString();
          final resepmakanan = resep[index].toString();
          return Container(
            height: 200,
            padding: EdgeInsets.all(8),
            child: GestureDetector(
              child: Stack(
                children: <Widget>[
                  backgroundImage(img),
                  Container(
                    child: topContent(title, subTitle, sample),
                  )
                ],
              ),
              onTap: () {
                Navigator.push(
                    context,
                    MaterialPageRoute(
                        builder: (context) => DetailPage(
                          itemJudul: title,
                          itemImage: img,
                          itemSub: subTitle,
                          qty: resepmakanan,
                        )));
              },
            ),
          );
        },
      ),
    );
  }
}

backgroundImage(String gambar) {
  return new Container(
    decoration: BoxDecoration(
        borderRadius: BorderRadius.circular(20),
        image: DecorationImage(
            fit: BoxFit.fill,
            colorFilter: ColorFilter.mode(
                Colors.black.withOpacity(0.5), BlendMode.luminosity),
            image: AssetImage(gambar))),
  );
}

topContent(String nama, String deskripsi, String sample) {
  return new Container(
    height: 150,
    child: Padding(
      padding: const EdgeInsets.all(20.0),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        mainAxisSize: MainAxisSize.max,
        children: <Widget>[
          Text(
            nama,
            style: bigHeaderText,
          ),
          Container(
            height: 1,
            width: 100,
            color: Colors.redAccent,
          ),
          Text(
            deskripsi,
            style: descHeaderText,
          ),

          Text(
            sample,
            style: footerHeaderText,
          )
        ],
      ),
    ),
  );
}

final baseTextStyle = const TextStyle( fontFamily: 'arial');

final bigHeaderText =
baseTextStyle.copyWith(fontSize: 24, fontWeight: FontWeight.bold, color: Colors.white);

final descHeaderText =
baseTextStyle.copyWith(fontSize: 18, fontWeight: FontWeight.w400, color: Colors.white);

final footerHeaderText =
baseTextStyle.copyWith(fontSize: 14, fontWeight: FontWeight.w400, color: Colors.white);

final detailstyle =
baseTextStyle.copyWith(fontSize: 16, fontWeight: FontWeight.bold, color: Colors.black);
