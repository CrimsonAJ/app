.class public final LJ5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/c;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LJ5/j;->a:I

    iput-object p2, p0, LJ5/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJ5/f;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v3, p0, LJ5/j;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget v4, p0, LJ5/j;->a:I

    .line 7
    .line 8
    packed-switch v4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Lcom/anilab/android/ui/player/PlayerActivity;

    .line 12
    .line 13
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/Y1;->p(Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    sget v4, Lcom/anilab/android/ui/player/PlayerActivity;->w0:I

    .line 17
    .line 18
    invoke-virtual {v3}, Lcom/anilab/android/ui/player/PlayerActivity;->d0()Lg2/a0;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    iget p1, p1, LJ5/f;->d:I

    .line 23
    .line 24
    if-ne p1, v2, :cond_0

    .line 25
    .line 26
    move v6, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v6, v1

    .line 29
    :goto_0
    invoke-virtual {v3}, Lcom/anilab/android/ui/player/PlayerActivity;->Z()Lj3/r0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1}, Lj3/r0;->T()J

    .line 34
    .line 35
    .line 36
    move-result-wide v8

    .line 37
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v5, Lg2/Z;

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    invoke-direct/range {v5 .. v10}, Lg2/Z;-><init>(ZLg2/a0;JLE7/d;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7, v1, v5}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 47
    .line 48
    .line 49
    iget-object p1, v3, Lcom/anilab/android/ui/player/PlayerActivity;->D:LJ1/c;

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    iget-object p1, p1, LJ1/c;->C:Lcom/google/android/material/chip/ChipGroup;

    .line 54
    .line 55
    const-string v0, "chipGroupServer"

    .line 56
    .line 57
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, p1}, Lcom/anilab/android/ui/player/PlayerActivity;->m0(Lcom/google/android/material/chip/ChipGroup;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Lcom/anilab/android/ui/player/PlayerActivity;->n0()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    const-string p1, "binding"

    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :pswitch_0
    check-cast v3, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;

    .line 74
    .line 75
    invoke-virtual {v3}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iget p1, p1, LJ5/f;->d:I

    .line 80
    .line 81
    if-nez p1, :cond_2

    .line 82
    .line 83
    move v1, v2

    .line 84
    :cond_2
    xor-int/lit8 p1, v1, 0x1

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v1, LT1/F;

    .line 90
    .line 91
    invoke-direct {v1, v3, p1, v0}, LT1/F;-><init>(LT1/G;ZLE7/d;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v2, v1}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_1
    check-cast v3, Lcom/anilab/android/ui/download/DownloadFragment;

    .line 99
    .line 100
    invoke-virtual {v3}, Lcom/anilab/android/ui/download/DownloadFragment;->t0()LR1/A;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget p1, p1, LJ5/f;->d:I

    .line 105
    .line 106
    const/4 v8, 0x1

    .line 107
    if-nez p1, :cond_3

    .line 108
    .line 109
    move v1, v8

    .line 110
    :cond_3
    xor-int/lit8 p1, v1, 0x1

    .line 111
    .line 112
    iput-boolean p1, v5, LR1/A;->p:Z

    .line 113
    .line 114
    iget-object p1, v5, LR1/A;->m:LI2/a;

    .line 115
    .line 116
    iget-wide v6, p1, LI2/a;->a:J

    .line 117
    .line 118
    new-instance v4, LR1/y;

    .line 119
    .line 120
    const/4 v9, 0x0

    .line 121
    invoke-direct/range {v4 .. v9}, LR1/y;-><init>(LR1/A;JZLE7/d;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v2, v4}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_2
    iget p1, p1, LJ5/f;->d:I

    .line 129
    .line 130
    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    .line 131
    .line 132
    invoke-virtual {v3, p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->b(IZ)V

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
