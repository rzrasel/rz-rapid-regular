import "package:flutter/material.dart";

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Container(
        child: const Text(
          "Home Page",
          style: TextStyle(
            fontSize: 30.0,
          ),
        ),
      ),
    );
  }
}
