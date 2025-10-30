.class public final synthetic LQ2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LQ2/D;


# direct methods
.method public synthetic constructor <init>(LQ2/D;I)V
    .locals 0

    .line 1
    iput p2, p0, LQ2/m;->a:I

    iput-object p1, p0, LQ2/m;->b:LQ2/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    iget p1, p0, LQ2/m;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LQ2/m;->b:LQ2/D;

    .line 7
    .line 8
    iget-object v0, p1, LQ2/D;->b:LQ2/e;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    check-cast v0, Lg2/D;

    .line 13
    .line 14
    iget-object v1, v0, Lg2/D;->c:LJ1/c;

    .line 15
    .line 16
    iget-object v2, v1, LJ1/c;->M:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    const-string v3, "layoutSubSync"

    .line 19
    .line 20
    invoke-static {v2, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    check-cast v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 30
    .line 31
    iget-object v0, v0, Lg2/D;->b:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 32
    .line 33
    invoke-virtual {v0}, Li/h;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget v5, v5, Landroid/content/res/Configuration;->orientation:I

    .line 42
    .line 43
    const/4 v6, 0x2

    .line 44
    const/4 v7, -0x1

    .line 45
    if-ne v5, v6, :cond_0

    .line 46
    .line 47
    move v0, v7

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v0}, Li/h;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const v5, 0x7f0701ab

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    :goto_0
    iput v0, v4, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 61
    .line 62
    iput v7, v4, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 63
    .line 64
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v1, LJ1/c;->N:Lcom/anilab/exoplayer/StyledPlayerView;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 70
    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    invoke-virtual {v0}, LQ2/D;->e()V

    .line 74
    .line 75
    .line 76
    :cond_1
    iget-object v0, v1, LJ1/c;->M:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 77
    .line 78
    invoke-static {v0, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p1, LQ2/D;->I0:Landroid/widget/PopupWindow;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 92
    .line 93
    const-string v0, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 94
    .line 95
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :cond_3
    :goto_1
    return-void

    .line 100
    :pswitch_0
    iget-object p1, p0, LQ2/m;->b:LQ2/D;

    .line 101
    .line 102
    iget-object p1, p1, LQ2/D;->I0:Landroid/widget/PopupWindow;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_1
    iget-object p1, p0, LQ2/m;->b:LQ2/D;

    .line 109
    .line 110
    iget-boolean v0, p1, LQ2/D;->o0:Z

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    invoke-virtual {p1}, LQ2/D;->h()V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    iget-object p1, p1, LQ2/D;->b:LQ2/e;

    .line 119
    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    check-cast p1, Lg2/D;

    .line 123
    .line 124
    iget-object p1, p1, Lg2/D;->b:Lcom/anilab/android/ui/player/PlayerActivity;

    .line 125
    .line 126
    invoke-static {p1}, Lcom/anilab/android/ui/player/PlayerActivity;->T(Lcom/anilab/android/ui/player/PlayerActivity;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_2
    return-void

    .line 130
    :pswitch_2
    iget-object p1, p0, LQ2/m;->b:LQ2/D;

    .line 131
    .line 132
    invoke-virtual {p1}, LQ2/D;->h()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method
