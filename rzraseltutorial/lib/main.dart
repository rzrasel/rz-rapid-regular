import "package:flutter/material.dart";

import 'app_view.dart';
import 'routes/app_route_generator.dart';
import 'routes/app_routes.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "Rz Rasel Tutorial",
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      builder: (_, child) => AppView(
        child: child!,
      ),
      initialRoute: routeHome,
      navigatorKey: navKey,
      onGenerateRoute: AppRouteGenerator.generateRoute,
    );
  }
}
