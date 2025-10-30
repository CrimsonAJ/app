.class public final Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;
.super Ld2/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld2/d<",
        "Ld2/K;",
        "LJ1/e0;",
        ">;"
    }
.end annotation


# instance fields
.field public final F0:LY2/r;

.field public final G0:Lb5/G1;

.field public final H0:LA7/l;

.field public final I0:LA7/l;

.field public J0:LY7/y0;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ld2/d;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld2/w;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Ld2/w;-><init>(Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;I)V

    .line 8
    .line 9
    .line 10
    sget-object v1, LA7/f;->a:LA7/f;

    .line 11
    .line 12
    new-instance v2, Ly8/f;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v2, v3, v0}, Ly8/f;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-class v1, Ld2/K;

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Lc2/h;

    .line 29
    .line 30
    const/4 v3, 0x6

    .line 31
    invoke-direct {v2, v0, v3}, Lc2/h;-><init>(LA7/e;I)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lc2/h;

    .line 35
    .line 36
    const/4 v4, 0x7

    .line 37
    invoke-direct {v3, v0, v4}, Lc2/h;-><init>(LA7/e;I)V

    .line 38
    .line 39
    .line 40
    new-instance v4, LN1/t;

    .line 41
    .line 42
    const/16 v5, 0x12

    .line 43
    .line 44
    invoke-direct {v4, p0, v0, v5}, LN1/t;-><init>(Li0/v;LA7/e;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->F0:LY2/r;

    .line 52
    .line 53
    new-instance v0, Lb5/G1;

    .line 54
    .line 55
    const-class v1, Ld2/x;

    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v2, Ld2/w;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v2, p0, v3}, Ld2/w;-><init>(Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;I)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, v1, v2}, Lb5/G1;-><init>(Lkotlin/jvm/internal/d;LO7/a;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->G0:Lb5/G1;

    .line 71
    .line 72
    new-instance v0, Ld2/e;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-direct {v0, p0, v1}, Ld2/e;-><init>(Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->H0:LA7/l;

    .line 83
    .line 84
    new-instance v0, Ld2/e;

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    invoke-direct {v0, p0, v1}, Ld2/e;-><init>(Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->I0:LA7/l;

    .line 95
    .line 96
    return-void
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method


# virtual methods
.method public final A0(Lcom/anilab/domain/model/Movie;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/e0;

    .line 6
    .line 7
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, LJ1/e0;

    .line 12
    .line 13
    iget-object v1, v1, LW/g;->k:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-boolean p1, p1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const p1, 0x7f060057

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const p1, 0x7f060382

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {v1, p1}, Landroid/content/Context;->getColor(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v0, v0, LJ1/e0;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 41
    .line 42
    .line 43
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final f0()I
    .locals 1

    .line 1
    const v0, 0x7f0d0057

    return v0
.end method

.method public final bridge synthetic h0()LM1/r;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final k0(I)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0x7f1401c2

    .line 3
    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sparse-switch p1, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :sswitch_0
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p1, p1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 16
    .line 17
    iget-wide v3, p1, Lcom/anilab/domain/model/Movie;->a:J

    .line 18
    .line 19
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v1, LA7/h;

    .line 24
    .line 25
    const-string v3, "EXTRA_MOVIE_ID"

    .line 26
    .line 27
    invoke-direct {v1, v3, p1}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-array p1, v2, [LA7/h;

    .line 31
    .line 32
    aput-object v1, p1, v0

    .line 33
    .line 34
    invoke-static {p1}, LZ0/a;->c([LA7/h;)Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const v0, 0x7f0a00e8

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0, p1}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :sswitch_1
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p1, p1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 50
    .line 51
    new-instance v0, Ld2/z;

    .line 52
    .line 53
    invoke-direct {v0, p1}, Ld2/z;-><init>(Lcom/anilab/domain/model/Movie;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, LM1/n;->j0(Lu0/D;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :sswitch_2
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v0, v0, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 69
    .line 70
    iget-object p1, p1, Ld2/K;->p:LL2/u;

    .line 71
    .line 72
    const/4 v1, 0x2

    .line 73
    iget-wide v2, v0, Lcom/anilab/domain/model/Movie;->a:J

    .line 74
    .line 75
    invoke-static {p1, v2, v3, v1}, LL2/u;->a(LL2/u;JI)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    new-instance p1, LM1/D;

    .line 86
    .line 87
    const v0, 0x7f140176

    .line 88
    .line 89
    .line 90
    invoke-direct {p1, v0}, LM1/D;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, LM1/n;->o0(LM1/E;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 98
    .line 99
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v1, "android.intent.action.SEND"

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    .line 106
    .line 107
    const-string v1, "android.intent.extra.TEXT"

    .line 108
    .line 109
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    const-string p1, "text/plain"

    .line 113
    .line 114
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 115
    .line 116
    .line 117
    const p1, 0x7f140103

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1}, Li0/v;->r(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p0, p1}, Li0/v;->d0(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :catch_0
    new-instance p1, LM1/D;

    .line 133
    .line 134
    const v0, 0x7f140180

    .line 135
    .line 136
    .line 137
    invoke-direct {p1, v0}, LM1/D;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p1}, LM1/n;->o0(LM1/E;)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :sswitch_3
    invoke-virtual {p0}, Li0/v;->k()Li0/y;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-eqz p1, :cond_2

    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iget-boolean p1, p1, Ld2/K;->A:Z

    .line 155
    .line 156
    if-eqz p1, :cond_1

    .line 157
    .line 158
    new-instance p1, LM1/D;

    .line 159
    .line 160
    invoke-direct {p1, v1}, LM1/D;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p1}, LM1/n;->o0(LM1/E;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_1
    new-instance v2, LH2/s;

    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-object p1, p1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iget-object v0, v0, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    iget-object v1, v1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 186
    .line 187
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    iget-object v3, v3, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 192
    .line 193
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    iget-object v4, v4, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 198
    .line 199
    const/16 v11, 0x8

    .line 200
    .line 201
    const-wide/16 v7, 0x0

    .line 202
    .line 203
    iget-wide v5, p1, Lcom/anilab/domain/model/Movie;->a:J

    .line 204
    .line 205
    iget-object p1, v0, Lcom/anilab/domain/model/Movie;->c:Ljava/lang/String;

    .line 206
    .line 207
    iget-object v0, v1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 208
    .line 209
    iget v9, v3, Lcom/anilab/domain/model/Movie;->g:I

    .line 210
    .line 211
    iget-object v10, v4, Lcom/anilab/domain/model/Movie;->d:Ljava/util/List;

    .line 212
    .line 213
    move-wide v3, v5

    .line 214
    move-object v5, p1

    .line 215
    move-object v6, v0

    .line 216
    invoke-direct/range {v2 .. v11}, LH2/s;-><init>(JLjava/lang/String;Ljava/lang/String;JILjava/util/List;I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v2}, LM1/B;->t0(LH2/s;)V

    .line 220
    .line 221
    .line 222
    :cond_2
    :goto_0
    return-void

    .line 223
    :sswitch_4
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    iget-boolean p1, p1, Ld2/K;->A:Z

    .line 228
    .line 229
    if-eqz p1, :cond_3

    .line 230
    .line 231
    new-instance p1, LM1/D;

    .line 232
    .line 233
    invoke-direct {p1, v1}, LM1/D;-><init>(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, p1}, LM1/n;->o0(LM1/E;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_3
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    iget-object p1, p1, Ld2/K;->z:LH2/h;

    .line 245
    .line 246
    if-eqz p1, :cond_4

    .line 247
    .line 248
    iget-boolean p1, p1, LH2/h;->a:Z

    .line 249
    .line 250
    if-ne p1, v2, :cond_4

    .line 251
    .line 252
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iget-object p1, p1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 257
    .line 258
    new-instance v0, Ld2/y;

    .line 259
    .line 260
    invoke-direct {v0, p1}, Ld2/y;-><init>(Lcom/anilab/domain/model/Movie;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0, v0}, LM1/n;->j0(Lu0/D;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_4
    new-instance p1, LM1/D;

    .line 268
    .line 269
    const v0, 0x7f140145

    .line 270
    .line 271
    .line 272
    invoke-direct {p1, v0}, LM1/D;-><init>(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0, p1}, LM1/n;->o0(LM1/E;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :sswitch_5
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    iget-object p1, p1, Ld2/K;->l:LP2/e;

    .line 284
    .line 285
    iget-object p1, p1, LP2/e;->a:LC2/g0;

    .line 286
    .line 287
    invoke-virtual {p1}, LC2/g0;->b()Z

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    if-nez p1, :cond_5

    .line 292
    .line 293
    new-instance p1, Lu0/a;

    .line 294
    .line 295
    const v0, 0x7f0a018d

    .line 296
    .line 297
    .line 298
    invoke-direct {p1, v0}, Lu0/a;-><init>(I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0, p1}, LM1/n;->j0(Lu0/D;)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :cond_5
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    iget-object p1, p1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 314
    .line 315
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    iget-object v1, v1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 320
    .line 321
    iget-boolean v1, v1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 322
    .line 323
    xor-int/lit8 v4, v1, 0x1

    .line 324
    .line 325
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    new-instance v3, Ld2/J;

    .line 329
    .line 330
    const/4 v8, 0x0

    .line 331
    iget-wide v6, p1, Lcom/anilab/domain/model/Movie;->a:J

    .line 332
    .line 333
    invoke-direct/range {v3 .. v8}, Ld2/J;-><init>(ZLd2/K;JLE7/d;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v5, v0, v3}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    iget-object p1, p1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 344
    .line 345
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    iget-object v0, v0, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 350
    .line 351
    iget-boolean v0, v0, Lcom/anilab/domain/model/Movie;->p:Z

    .line 352
    .line 353
    xor-int/2addr v0, v2

    .line 354
    iput-boolean v0, p1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 355
    .line 356
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    iget-object p1, p1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 361
    .line 362
    invoke-virtual {p0, p1}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->A0(Lcom/anilab/domain/model/Movie;)V

    .line 363
    .line 364
    .line 365
    return-void

    .line 366
    :sswitch_6
    invoke-static {p0}, LM1/n;->q0(LM1/n;)V

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    nop

    .line 371
    :sswitch_data_0
    .sparse-switch
        0x7f0a0071 -> :sswitch_6
        0x7f0a0073 -> :sswitch_5
        0x7f0a007e -> :sswitch_4
        0x7f0a0096 -> :sswitch_3
        0x7f0a00a6 -> :sswitch_2
        0x7f0a01ce -> :sswitch_1
        0x7f0a039b -> :sswitch_0
        0x7f0a03ce -> :sswitch_1
    .end sparse-switch
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method

.method public final l0()V
    .locals 6

    .line 1
    invoke-super {p0}, LM1/B;->l0()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Ld2/s;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2, p0}, Ld2/s;-><init>(LE7/d;Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v1, v1, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v3, v0, Ld2/K;->q:Lb8/Q;

    .line 32
    .line 33
    invoke-virtual {v3}, Lb8/Q;->h()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {v3}, Lb8/Q;->h()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const/4 v4, 0x0

    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v3, v4

    .line 50
    :goto_0
    new-instance v5, Ld2/G;

    .line 51
    .line 52
    invoke-direct {v5, v0, v1, v2}, Ld2/G;-><init>(Ld2/K;Lcom/anilab/domain/model/Movie;LE7/d;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3, v5}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 56
    .line 57
    .line 58
    new-instance v3, Ld2/H;

    .line 59
    .line 60
    invoke-direct {v3, v0, v1, v2}, Ld2/H;-><init>(Ld2/K;Lcom/anilab/domain/model/Movie;LE7/d;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v4, v3}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 64
    .line 65
    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final m0(LW/g;)Ljava/util/List;
    .locals 9

    .line 1
    check-cast p1, LJ1/e0;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/e0;->P:Landroidx/appcompat/widget/AppCompatTextView;

    .line 4
    .line 5
    iget-object v1, p1, LJ1/e0;->E:Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    .line 7
    iget-object v2, p1, LJ1/e0;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    iget-object v3, p1, LJ1/e0;->z:Lcom/google/android/material/button/MaterialButton;

    .line 10
    .line 11
    iget-object v4, p1, LJ1/e0;->y:Lcom/google/android/material/button/MaterialButton;

    .line 12
    .line 13
    iget-object v5, p1, LJ1/e0;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 14
    .line 15
    iget-object v6, p1, LJ1/e0;->A:Landroidx/appcompat/widget/AppCompatImageView;

    .line 16
    .line 17
    iget-object p1, p1, LJ1/e0;->J:Landroidx/appcompat/widget/AppCompatTextView;

    .line 18
    .line 19
    const/16 v7, 0x8

    .line 20
    .line 21
    new-array v7, v7, [Landroid/view/View;

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    aput-object v2, v7, v8

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    aput-object v3, v7, v2

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    aput-object v4, v7, v2

    .line 31
    .line 32
    const/4 v2, 0x3

    .line 33
    aput-object v5, v7, v2

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    aput-object v6, v7, v2

    .line 37
    .line 38
    const/4 v2, 0x5

    .line 39
    aput-object p1, v7, v2

    .line 40
    .line 41
    const/4 p1, 0x6

    .line 42
    aput-object v0, v7, p1

    .line 43
    .line 44
    const/4 p1, 0x7

    .line 45
    aput-object v1, v7, p1

    .line 46
    .line 47
    invoke-static {v7}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final n0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/e0;

    .line 6
    .line 7
    const-string v1, "layoutLoading"

    .line 8
    .line 9
    iget-object v0, v0, LJ1/e0;->G:Lcom/anilab/android/ui/views/FreakLoading;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 p1, 0x8

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final p0()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v2, v2, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->z0(Lcom/anilab/domain/model/Movie;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, LJ1/e0;

    .line 17
    .line 18
    new-instance v3, LA6/s;

    .line 19
    .line 20
    const/16 v4, 0x15

    .line 21
    .line 22
    invoke-direct {v3, v4, v2}, LA6/s;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const-wide/16 v4, 0x7d0

    .line 26
    .line 27
    iget-object v6, v2, LJ1/e0;->M:Landroidx/appcompat/widget/AppCompatTextView;

    .line 28
    .line 29
    invoke-virtual {v6, v3, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    .line 31
    .line 32
    iget-object v3, v2, LJ1/e0;->H:Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v4, v2, LJ1/e0;->I:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->H0:LA7/l;

    .line 43
    .line 44
    invoke-virtual {v5}, LA7/l;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Ld2/b;

    .line 49
    .line 50
    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LF0/S;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->I0:LA7/l;

    .line 54
    .line 55
    invoke-virtual {v3}, LA7/l;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Ld2/L;

    .line 60
    .line 61
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LF0/S;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, LI5/k;

    .line 65
    .line 66
    const/16 v4, 0xf

    .line 67
    .line 68
    invoke-direct {v3, v2, v4, p0}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v4, v2, LJ1/e0;->D:Landroidx/appcompat/widget/AppCompatImageView;

    .line 72
    .line 73
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    iget-object v3, v2, LJ1/e0;->F:Landroidx/appcompat/widget/AppCompatEditText;

    .line 77
    .line 78
    const-string v4, "inputSearchEpisode"

    .line 79
    .line 80
    invoke-static {v3, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance v4, LR1/q;

    .line 84
    .line 85
    invoke-direct {v4, v2, p0, v1}, LR1/q;-><init>(LW/g;Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 89
    .line 90
    .line 91
    new-instance v4, LR1/b;

    .line 92
    .line 93
    invoke-direct {v4, v1, p0}, LR1/b;-><init>(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 97
    .line 98
    .line 99
    new-instance v3, Ld2/g;

    .line 100
    .line 101
    invoke-direct {v3, p0, v0}, Ld2/g;-><init>(Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;I)V

    .line 102
    .line 103
    .line 104
    iget-object v4, v2, LJ1/e0;->R:Landroidx/appcompat/widget/AppCompatTextView;

    .line 105
    .line 106
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    .line 108
    .line 109
    new-instance v3, Ld2/g;

    .line 110
    .line 111
    invoke-direct {v3, p0, v1}, Ld2/g;-><init>(Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;I)V

    .line 112
    .line 113
    .line 114
    iget-object v2, v2, LJ1/e0;->N:Landroidx/appcompat/widget/AppCompatTextView;

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget-boolean v2, v2, Ld2/K;->C:Z

    .line 124
    .line 125
    const/4 v3, 0x0

    .line 126
    if-nez v2, :cond_1

    .line 127
    .line 128
    invoke-virtual {p0}, Li0/v;->k()Li0/y;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-eqz v2, :cond_0

    .line 133
    .line 134
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    goto :goto_0

    .line 139
    :cond_0
    move-object v2, v3

    .line 140
    :goto_0
    if-eqz v2, :cond_1

    .line 141
    .line 142
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    check-cast v4, LJ1/e0;

    .line 147
    .line 148
    iget-object v4, v4, LJ1/e0;->x:Landroidx/mediarouter/app/MediaRouteButton;

    .line 149
    .line 150
    invoke-static {v2, v4}, Lu4/a;->a(Landroid/content/Context;Landroidx/mediarouter/app/MediaRouteButton;)V

    .line 151
    .line 152
    .line 153
    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/u1;->A(Li0/v;)Lu0/H;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    iget-object v2, v2, Lu0/H;->g:LB7/i;

    .line 158
    .line 159
    invoke-virtual {v2}, LB7/i;->g()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Lu0/m;

    .line 164
    .line 165
    if-eqz v2, :cond_5

    .line 166
    .line 167
    iget-object v2, v2, Lu0/m;->k:LA7/l;

    .line 168
    .line 169
    invoke-virtual {v2}, LA7/l;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, Landroidx/lifecycle/V;

    .line 174
    .line 175
    if-eqz v2, :cond_5

    .line 176
    .line 177
    iget-object v4, v2, Landroidx/lifecycle/V;->c:Ljava/util/LinkedHashMap;

    .line 178
    .line 179
    const-string v5, "UPDATE_VOTE"

    .line 180
    .line 181
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    instance-of v7, v6, Landroidx/lifecycle/E;

    .line 186
    .line 187
    if-eqz v7, :cond_2

    .line 188
    .line 189
    move-object v3, v6

    .line 190
    check-cast v3, Landroidx/lifecycle/E;

    .line 191
    .line 192
    :cond_2
    if-eqz v3, :cond_3

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_3
    iget-object v3, v2, Landroidx/lifecycle/V;->a:Ljava/util/LinkedHashMap;

    .line 196
    .line 197
    invoke-interface {v3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-eqz v6, :cond_4

    .line 202
    .line 203
    new-instance v6, Landroidx/lifecycle/U;

    .line 204
    .line 205
    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-direct {v6, v3}, Landroidx/lifecycle/E;-><init>(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    iput-object v5, v6, Landroidx/lifecycle/U;->l:Ljava/lang/String;

    .line 213
    .line 214
    iput-object v2, v6, Landroidx/lifecycle/U;->m:Landroidx/lifecycle/V;

    .line 215
    .line 216
    move-object v3, v6

    .line 217
    goto :goto_1

    .line 218
    :cond_4
    new-instance v3, Landroidx/lifecycle/U;

    .line 219
    .line 220
    invoke-direct {v3}, Landroidx/lifecycle/E;-><init>()V

    .line 221
    .line 222
    .line 223
    iput-object v5, v3, Landroidx/lifecycle/U;->l:Ljava/lang/String;

    .line 224
    .line 225
    iput-object v2, v3, Landroidx/lifecycle/U;->m:Landroidx/lifecycle/V;

    .line 226
    .line 227
    :goto_1
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    :goto_2
    invoke-virtual {p0}, Li0/v;->t()Li0/W;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    new-instance v4, Ld2/f;

    .line 235
    .line 236
    invoke-direct {v4, p0, v1}, Ld2/f;-><init>(Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;I)V

    .line 237
    .line 238
    .line 239
    new-instance v5, Ld2/u;

    .line 240
    .line 241
    invoke-direct {v5, v0, v4}, Ld2/u;-><init>(ILO7/l;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3, v2, v5}, Landroidx/lifecycle/E;->d(Landroidx/lifecycle/w;Landroidx/lifecycle/F;)V

    .line 245
    .line 246
    .line 247
    :cond_5
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    iget-object v2, v2, Ld2/x;->b:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    iget-object v3, v3, Ld2/x;->c:Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    iget-boolean v4, v4, Ld2/K;->B:Z

    .line 264
    .line 265
    if-eqz v4, :cond_6

    .line 266
    .line 267
    if-eqz v2, :cond_6

    .line 268
    .line 269
    if-eqz v3, :cond_6

    .line 270
    .line 271
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->y0()Ld2/K;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    iput-boolean v0, v2, Ld2/K;->B:Z

    .line 276
    .line 277
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    iget-object v2, v2, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 282
    .line 283
    iget-wide v2, v2, Lcom/anilab/domain/model/Movie;->a:J

    .line 284
    .line 285
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    new-instance v3, LA7/h;

    .line 290
    .line 291
    const-string v4, "EXTRA_MOVIE_ID"

    .line 292
    .line 293
    invoke-direct {v3, v4, v2}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    iget-object v2, v2, Ld2/x;->b:Ljava/lang/String;

    .line 301
    .line 302
    new-instance v4, LA7/h;

    .line 303
    .line 304
    const-string v5, "EXTRA_PARENT_ID"

    .line 305
    .line 306
    invoke-direct {v4, v5, v2}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    iget-object v2, v2, Ld2/x;->c:Ljava/lang/String;

    .line 314
    .line 315
    new-instance v5, LA7/h;

    .line 316
    .line 317
    const-string v6, "EXTRA_CHILD_ID"

    .line 318
    .line 319
    invoke-direct {v5, v6, v2}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    const/4 v2, 0x3

    .line 323
    new-array v2, v2, [LA7/h;

    .line 324
    .line 325
    aput-object v3, v2, v0

    .line 326
    .line 327
    aput-object v4, v2, v1

    .line 328
    .line 329
    const/4 v0, 0x2

    .line 330
    aput-object v5, v2, v0

    .line 331
    .line 332
    invoke-static {v2}, LZ0/a;->c([LA7/h;)Landroid/os/Bundle;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const v1, 0x7f0a00e8

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0, v1, v0}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 340
    .line 341
    .line 342
    :cond_6
    return-void
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final u0()V
    .locals 2

    .line 1
    new-instance v0, Lu0/a;

    .line 2
    .line 3
    const v1, 0x7f0a0190

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lu0/a;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, LM1/n;->j0(Lu0/D;)V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final v0()V
    .locals 2

    .line 1
    new-instance v0, Lu0/a;

    .line 2
    .line 3
    const v1, 0x7f0a0192

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lu0/a;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, LM1/n;->j0(Lu0/D;)V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final x0()Ld2/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->G0:Lb5/G1;

    .line 2
    .line 3
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld2/x;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final y0()Ld2/K;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->F0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld2/K;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final z0(Lcom/anilab/domain/model/Movie;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v2, v2, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 11
    .line 12
    iget-wide v3, p1, Lcom/anilab/domain/model/Movie;->r:D

    .line 13
    .line 14
    iput-wide v3, v2, Lcom/anilab/domain/model/Movie;->r:D

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->x0()Ld2/x;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v2, v2, Ld2/x;->a:Lcom/anilab/domain/model/Movie;

    .line 21
    .line 22
    iget-boolean v3, p1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 23
    .line 24
    iput-boolean v3, v2, Lcom/anilab/domain/model/Movie;->p:Z

    .line 25
    .line 26
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, LJ1/e0;

    .line 31
    .line 32
    iget-object v3, v2, LJ1/e0;->C:Landroidx/appcompat/widget/AppCompatImageView;

    .line 33
    .line 34
    const-string v4, "imageMovie"

    .line 35
    .line 36
    invoke-static {v3, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v4, "313x438"

    .line 40
    .line 41
    const-string v5, "963x900"

    .line 42
    .line 43
    iget-object v6, p1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v6, v4, v5}, LW7/l;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {v5}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    new-instance v6, LC1/h;

    .line 58
    .line 59
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-direct {v6, v7}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    iput-object v4, v6, LC1/h;->c:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {v6, v3}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6}, LC1/h;->a()LC1/i;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v5, v3}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 76
    .line 77
    .line 78
    iget-object v3, v2, LJ1/e0;->M:Landroidx/appcompat/widget/AppCompatTextView;

    .line 79
    .line 80
    iget-object v4, p1, Lcom/anilab/domain/model/Movie;->c:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    iget-wide v3, p1, Lcom/anilab/domain/model/Movie;->r:D

    .line 86
    .line 87
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iget-object v4, v2, LJ1/e0;->P:Landroidx/appcompat/widget/AppCompatTextView;

    .line 92
    .line 93
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    iget v3, p1, Lcom/anilab/domain/model/Movie;->g:I

    .line 97
    .line 98
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-lez v3, :cond_1

    .line 103
    .line 104
    move v3, v1

    .line 105
    goto :goto_0

    .line 106
    :cond_1
    move v3, v0

    .line 107
    :goto_0
    const/4 v5, 0x0

    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    move-object v4, v5

    .line 112
    :goto_1
    if-eqz v4, :cond_3

    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    :cond_3
    iget-object v3, v2, LJ1/e0;->S:Landroidx/appcompat/widget/AppCompatTextView;

    .line 119
    .line 120
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Lcom/anilab/domain/model/Movie;->a()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    new-array v4, v1, [Ljava/lang/Object;

    .line 128
    .line 129
    aput-object v3, v4, v0

    .line 130
    .line 131
    const v3, 0x7f1400b9

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v3, v4}, Li0/v;->s(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    iget-object v4, v2, LJ1/e0;->L:Landroidx/appcompat/widget/AppCompatTextView;

    .line 139
    .line 140
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    iget-object v3, p1, Lcom/anilab/domain/model/Movie;->e:Ljava/lang/String;

    .line 144
    .line 145
    iget-object v4, v2, LJ1/e0;->N:Landroidx/appcompat/widget/AppCompatTextView;

    .line 146
    .line 147
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    new-instance v3, Ld2/v;

    .line 151
    .line 152
    invoke-direct {v3, v4, v2, p1}, Ld2/v;-><init>(Landroidx/appcompat/widget/AppCompatTextView;LJ1/e0;Lcom/anilab/domain/model/Movie;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v4, v3}, LP/q;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 156
    .line 157
    .line 158
    iget-object v3, p1, Lcom/anilab/domain/model/Movie;->s:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v4, v2, LJ1/e0;->Q:Landroidx/appcompat/widget/AppCompatTextView;

    .line 161
    .line 162
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v3}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    const/16 v5, 0x8

    .line 170
    .line 171
    if-nez v3, :cond_4

    .line 172
    .line 173
    move v3, v0

    .line 174
    goto :goto_2

    .line 175
    :cond_4
    move v3, v5

    .line 176
    :goto_2
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 177
    .line 178
    .line 179
    iget-object v3, p1, Lcom/anilab/domain/model/Movie;->t:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v4, v2, LJ1/e0;->O:Landroidx/appcompat/widget/AppCompatTextView;

    .line 182
    .line 183
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v3}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-nez v3, :cond_5

    .line 191
    .line 192
    move v3, v0

    .line 193
    goto :goto_3

    .line 194
    :cond_5
    move v3, v5

    .line 195
    :goto_3
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 196
    .line 197
    .line 198
    iget-object v2, v2, LJ1/e0;->K:Landroidx/appcompat/widget/AppCompatTextView;

    .line 199
    .line 200
    const-string v3, "textDUB"

    .line 201
    .line 202
    invoke-static {v2, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget v3, p1, Lcom/anilab/domain/model/Movie;->l:I

    .line 206
    .line 207
    if-ne v3, v1, :cond_6

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_6
    move v0, v5

    .line 211
    :goto_4
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, p1}, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;->A0(Lcom/anilab/domain/model/Movie;)V

    .line 215
    .line 216
    .line 217
    return-void
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
