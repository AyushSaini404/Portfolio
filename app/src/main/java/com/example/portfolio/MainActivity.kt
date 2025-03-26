package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.portfolio.ui.theme.PortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener{
            val intent = Intent(this , SkillsActivity::class.java)
            startActivity(intent)

            val buttonEd =  findViewById<Button>(R.id.btnEd)
            buttonEd.setOnClickListener {
                val intent1 =  Intent(this, EducationActivity::class.java)
                startActivity(intent1)
            }

            val buttonAchievements = findViewById< Button>(R.id.btnAchievements)
            buttonAchievements.setOnClickListener{
                val intent3 = Intent(this , AchievementsActivity::class.java)
                startActivity(intent3)
            }



        }

    }
}
