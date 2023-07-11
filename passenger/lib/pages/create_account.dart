import 'package:flutter/material.dart';
import 'package:rydex/components/my_button.dart';
import 'package:rydex/components/my_textfield.dart';
import 'package:rydex/components/square_tile.dart';

class CreateAccountPage extends StatelessWidget {
  CreateAccountPage({super.key});

  // text editing controllers
  final usernameController = TextEditingController();
  final passwordController = TextEditingController();

  // sign user in method
  void signUserIn(BuildContext context) {
    Navigator.push(
      context,
      MaterialPageRoute(builder: (context) => CreateAccountPage()),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      body: SafeArea(
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.start,
            children: [
              const SizedBox(height: 50),
              Text(
                'Create An Account',
                style: TextStyle(
                  color: Colors.grey[700],
                  fontSize: 16,
                  fontFamily: 'Roboto'
                ),
              ),

              const SizedBox(height: 25),

              // Phone Number textfield
              MyTextField(
                controller: usernameController,
                hintText: 'First Name',
                obscureText: false,
              ),
              const SizedBox(height: 19),
              // Phone Number textfield
              MyTextField(
                controller: usernameController,
                hintText: 'Last Name',
                obscureText: false,
              ),
              const SizedBox(height: 19),
              // Phone Number textfield
              MyTextField(
                controller: usernameController,
                hintText: 'Email',
                obscureText: false,
              ),

              const SizedBox(height: 10),

              const SizedBox(height: 10),

              MyButton(
                onTap: () {
                  signUserIn(context); // Pass the `BuildContext` to the function
                },
              ),
              const SizedBox(height: 50),
            ],
          ),
        ),
      ),
    );
  }
}
