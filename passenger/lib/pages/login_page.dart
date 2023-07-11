import 'package:flutter/material.dart';
import 'package:rydex/components/my_button.dart';
import 'package:rydex/components/my_textfield.dart';
import 'package:rydex/components/square_tile.dart';
import 'package:rydex/pages/verification.dart';

class LoginPage extends StatelessWidget {
  LoginPage({super.key});

  // text editing controllers
  final usernameController = TextEditingController();
  final passwordController = TextEditingController();

  // sign user in method
  void signUserIn(BuildContext context) {
    Navigator.push(
      context,
      MaterialPageRoute(builder: (context) => VerificationPage()),
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
                'Enter Your Phone Number',
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
                hintText: 'Phone Number',
                obscureText: false,
              ),

              const SizedBox(height: 10),

              const SizedBox(height: 10),

              MyButton(
                onTap: () {
                  signUserIn(context); // Pass the `BuildContext` to the function
                },
              ),

              const SizedBox(height: 25),
              Padding(
                padding: const EdgeInsets.symmetric(horizontal: 25.0),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Text(
                      'By continuing you agree with the Terms of Service \n and Privacy Policy',
                      style: TextStyle(color: Colors.grey[600]),
                    ),
                  ],
                ),
              ),
              const SizedBox(height: 50),
            ],
          ),
        ),
      ),
    );
  }
}
