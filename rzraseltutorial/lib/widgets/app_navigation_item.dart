import "package:flutter/material.dart";

class AppNavigationItem extends StatelessWidget {
  final String title;
  final String routeName;

  const AppNavigationItem({required this.title, required this.routeName, super.key});

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: () {

      },
      child: Padding(
        padding: const EdgeInsets.symmetric(horizontal: 50.0,),
        child: Text(
          title,
          style: const TextStyle(
            fontSize: 14.0,
          ),
        ),
      ),
    );
  }
}