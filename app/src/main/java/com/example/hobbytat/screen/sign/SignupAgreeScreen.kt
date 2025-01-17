package com.example.hobbytat.screen.sign

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.hobbytat.R
import com.example.hobbytat.common.BlueButton
import com.example.hobbytat.common.signupTopBar

@Composable
fun SignupAgreeScreen(navController: NavHostController) {
    Scaffold(
        topBar = {signupTopBar()}
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp, bottom = 60.dp)
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "취향 유형 검사를\n시작합니다.",
                    fontSize = 39.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center,
                    lineHeight = 50.sp,
                    color = colorResource(id = R.color.main_blue_dark)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "여덟 가지 취향 유형 중 하나의 유형을\n결정하기 위한 검사입니다.\n\n자신의 취향 유형을 정확하게 확인할 수 있도록\n솔직하게 답변해주세요!\n\n문항은 총 8개입니다.\n(약 1분 소요)",
                    textAlign = TextAlign.Center
                )
            }

            BlueButton(label = "확인", 8, 16,45, R.color.main_blue) {
                // 취향 유형 검사 페이지로 이동
                navController.navigate("SignUp_Question")
            }
        }
    }
}