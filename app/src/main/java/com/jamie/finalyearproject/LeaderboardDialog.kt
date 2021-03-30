package com.jamie.finalyearproject

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LeaderboardDialog
{

    fun build(context : Context,first : String, two : String , winner : String) : Dialog
    {
        val dialog = Dialog(context)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.leaderboard_dialog)

        val first_field = dialog.findViewById<TextView>(R.id.first_line_field)
        val second_field = dialog.findViewById<TextView>(R.id.two_line_field)
        val win_field = dialog.findViewById<TextView>(R.id.winner_field)

        val close = dialog.findViewById<ImageView>(R.id.leaderboard_close)
        close.setOnClickListener {
            dialog.dismiss()
        }

        if(first.isEmpty())
        {
            first_field.text = "-:-"
        }
        else
        {
            first_field.text = first
        }

        if(two.isEmpty())
        {
            second_field.text = "-:-"
        }
        else
        {
            second_field.text = two
        }

        if(winner.isEmpty())
        {
            win_field.text = "-:-"
        }
        else
        {
            win_field.text = winner
        }



        return dialog
    }


    fun endGame(context : Context,first : String, two : String , winner : String,lines : Int,score : Int,reactions : Int, sp : Int) : Dialog
    {
        val dialog = Dialog(context)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.endgame_dialog)


        val oneLine = dialog.findViewById<TextView>(R.id.end_game_oneline)
        val twoLine = dialog.findViewById<TextView>(R.id.end_game_twoline)
        val win = dialog.findViewById<TextView>(R.id.end_game_winner)
        val line_field = dialog.findViewById<TextView>(R.id.endgame_lines_field)
        val score_field = dialog.findViewById<TextView>(R.id.endgame_score_field)
        val reacts = dialog.findViewById<TextView>(R.id.endgame_reacts_field)
        val playedSongs = dialog.findViewById<TextView>(R.id.endgame_sp_field)

        val button = dialog.findViewById<Button>(R.id.endgame_button)

        button.setOnClickListener {
            val i = Intent(context,OptionsActivity::class.java)
            context.startActivity(i)
        }

        oneLine.text = first
        twoLine.text = two
        win.text = winner
        line_field.text = lines.toString()
        score_field.text = score.toString()
        reacts.text = reactions.toString()
        playedSongs.text = sp.toString()


        return dialog
    }









}