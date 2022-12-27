import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(
        backgroundColor: Colors.pinkAccent,
        title: const Text(
          'Welcome Back Ahsan',
          style: TextStyle(fontSize: 30, fontStyle: FontStyle.italic, fontFamily: 'GreatVibes'),
        ),
      ),
      body: SafeArea(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: const [
                Text(
                  'Hello',
                  style: TextStyle(fontSize: 20, decoration: TextDecoration.underline, fontFamily: 'Lobster'),
                ),
                Icon(Icons.access_alarm),
                Text(
                  'Time',
                  style: TextStyle(fontSize: 20, fontFamily: 'Lobster'),
                ),
              ],
            ),
            SizedBox(
              height: 50,
            ),
            Container(
              width: 100,
              height: 100,
              color: Colors.deepOrangeAccent,
              child: const Center(
                child: Text('!st Container'),
              ),
            ),
            const SizedBox(
              height: 10,
            ),
            Container(
              width: 100,
              height: 100,
              color: Colors.orange,
              child: const Center(
                child: Text('2st Container'),
              ),
            ),
            const SizedBox(
              height: 10,
            ),
            Container(
              width: 100,
              height: 100,
              color: Colors.lightGreenAccent,
              child: const Center(
                child: Text('3st Container'),
              ),
            ),
          ],
        ),
      ),
      //   body: const Center(
      //       child: Image(
      //   image: NetworkImage(
      //   'https://images.pexels.com/photos/11412419/pexels-photo-11412419.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load'))),
      //          image: AssetImage('images/foodpanda.png'))),
    ));
  }
}
