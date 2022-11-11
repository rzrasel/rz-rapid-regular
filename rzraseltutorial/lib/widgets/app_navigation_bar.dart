import "package:flutter/material.dart";
import 'package:rzraseltutorial/routes/app_routes.dart';

import 'app_navigation_item.dart';

class AppNavigationBar extends StatefulWidget {
  const AppNavigationBar({super.key});

  @override
  State<AppNavigationBar> createState() => AppNavigationBarState();
}

class AppNavigationBarState extends State<AppNavigationBar> {
  @override
  Widget build(BuildContext context) {
    return Container(
      height: 100,
      child: Row(
        mainAxisSize: MainAxisSize.max,
        children: const [
          AppNavigationItem(
            title: "Home",
            routeName: routeHome,
          ),
          SizedBox(
            width: 100.0,
          ),
          AppNavigationItem(
            title: "About",
            routeName: routeAbout,
          ),
          SizedBox(
            width: 100.0,
          ),
          AppNavigationItem(
            title: "Contact",
            routeName: routeContact,
          ),
        ],
      ),
    );
  }
}
