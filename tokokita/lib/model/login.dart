class Login {
  int code;
  bool status;
  String token;
  int userID;
  String userEmail;

  Login({this.code, this.status, this.token, this.userID, this.userEmail});

  factory Login.formJson(Map<String, dynamic> obj) {
    return Login(
        code: obj['code'],
        status: obj['status'],
        token: obj['data']['token'],
        userID: obj['data']['user']['id'],
        userEmail: obj['data']['user']['email']);
  }

  // ignore: missing_return
  static Future<Login> fromJson(jsonObj) {}
}
