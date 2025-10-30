.class public final Lcom/anilab/android/ui/download/DownloadFragment;
.super LR1/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LR1/D<",
        "LJ1/g;",
        "LR1/A;",
        ">;"
    }
.end annotation


# instance fields
.field public final S0:LY2/r;

.field public final T0:Lb5/G1;

.field public final U0:LA7/l;

.field public final V0:LA7/l;

.field public final W0:LJ5/j;

.field public X0:LY7/y0;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, LR1/D;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LR1/r;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, LR1/r;-><init>(Lcom/anilab/android/ui/download/DownloadFragment;I)V

    .line 8
    .line 9
    .line 10
    sget-object v1, LA7/f;->a:LA7/f;

    .line 11
    .line 12
    new-instance v2, LN1/r;

    .line 13
    .line 14
    const/4 v3, 0x5

    .line 15
    invoke-direct {v2, v3, v0}, LN1/r;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-class v1, LR1/A;

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, LN1/s;

    .line 29
    .line 30
    const/4 v3, 0x6

    .line 31
    invoke-direct {v2, v0, v3}, LN1/s;-><init>(LA7/e;I)V

    .line 32
    .line 33
    .line 34
    new-instance v3, LN1/s;

    .line 35
    .line 36
    const/4 v4, 0x7

    .line 37
    invoke-direct {v3, v0, v4}, LN1/s;-><init>(LA7/e;I)V

    .line 38
    .line 39
    .line 40
    new-instance v4, LN1/t;

    .line 41
    .line 42
    const/4 v5, 0x3

    .line 43
    invoke-direct {v4, p0, v0, v5}, LN1/t;-><init>(Li0/v;LA7/e;I)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lcom/anilab/android/ui/download/DownloadFragment;->S0:LY2/r;

    .line 51
    .line 52
    new-instance v0, Lb5/G1;

    .line 53
    .line 54
    const-class v1, LR1/s;

    .line 55
    .line 56
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v2, LR1/r;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-direct {v2, p0, v3}, LR1/r;-><init>(Lcom/anilab/android/ui/download/DownloadFragment;I)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1, v2}, Lb5/G1;-><init>(Lkotlin/jvm/internal/d;LO7/a;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lcom/anilab/android/ui/download/DownloadFragment;->T0:Lb5/G1;

    .line 70
    .line 71
    new-instance v0, LR1/a;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-direct {v0, p0, v1}, LR1/a;-><init>(Lcom/anilab/android/ui/download/DownloadFragment;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, Lcom/anilab/android/ui/download/DownloadFragment;->U0:LA7/l;

    .line 82
    .line 83
    new-instance v0, LR1/a;

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    invoke-direct {v0, p0, v1}, LR1/a;-><init>(Lcom/anilab/android/ui/download/DownloadFragment;I)V

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, Lcom/anilab/android/ui/download/DownloadFragment;->V0:LA7/l;

    .line 94
    .line 95
    new-instance v0, LJ5/j;

    .line 96
    .line 97
    invoke-direct {v0, v1, p0}, LJ5/j;-><init>(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, Lcom/anilab/android/ui/download/DownloadFragment;->W0:LJ5/j;

    .line 101
    .line 102
    return-void
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method


# virtual methods
.method public final Q()V
    .locals 2

    .line 1
    invoke-super {p0}, Li0/n;->Q()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, LJ1/g;

    .line 9
    .line 10
    iget-object v0, v0, LJ1/g;->E:Lcom/google/android/material/tabs/TabLayout;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/anilab/android/ui/download/DownloadFragment;->W0:LJ5/j;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->a(LJ5/b;)V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public final R()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/g;

    .line 6
    .line 7
    iget-object v0, v0, LJ1/g;->E:Lcom/google/android/material/tabs/TabLayout;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/google/android/material/tabs/TabLayout;->m0:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/anilab/android/ui/download/DownloadFragment;->W0:LJ5/j;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Li0/n;->R()V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public final n0()I
    .locals 1

    .line 1
    const v0, 0x7f0d001f

    return v0
.end method

.method public final o0(I)V
    .locals 6

    .line 1
    const v0, 0x7f0a0074

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_4

    .line 5
    .line 6
    const v0, 0x7f0a007e

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/anilab/android/ui/download/DownloadFragment;->t0()LR1/A;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/anilab/android/ui/download/DownloadFragment;->U0:LA7/l;

    .line 17
    .line 18
    invoke-virtual {v0}, LA7/l;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, LR1/C;

    .line 23
    .line 24
    iget-object v1, v0, LF0/I;->d:LF0/f;

    .line 25
    .line 26
    iget-object v1, v1, LF0/f;->f:Ljava/util/List;

    .line 27
    .line 28
    const-string v2, "getCurrentList(...)"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget v0, v0, LR1/C;->h:I

    .line 34
    .line 35
    invoke-static {v1, v0}, LB7/k;->r0(Ljava/util/List;I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, LH2/i;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-wide v2, v0, LH2/i;->a:J

    .line 45
    .line 46
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v0, v1

    .line 52
    :goto_0
    if-nez v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget-object v2, p1, LR1/A;->m:LI2/a;

    .line 59
    .line 60
    iget-wide v2, v2, LI2/a;->a:J

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    cmp-long v2, v2, v4

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    iget-object v2, p1, LR1/A;->m:LI2/a;

    .line 71
    .line 72
    iget-boolean v2, v2, LI2/a;->k:Z

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    new-instance v0, LM1/t;

    .line 77
    .line 78
    sget-object v2, LR1/v;->a:LR1/v;

    .line 79
    .line 80
    invoke-direct {v0, v2}, LM1/t;-><init>(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p1, LR1/A;->n:Lb8/Q;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v1, v0}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    new-instance v2, LR1/x;

    .line 93
    .line 94
    invoke-direct {v2, p1, v0, v1}, LR1/x;-><init>(LR1/A;Ljava/lang/Long;LE7/d;)V

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    invoke-virtual {p1, v0, v2}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/u1;->A(Li0/v;)Lu0/H;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Lu0/H;->m()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    :catch_0
    :goto_1
    return-void
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
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

.method public final p0()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LR1/o;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2, p0}, LR1/o;-><init>(LE7/d;Lcom/anilab/android/ui/download/DownloadFragment;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/anilab/android/ui/download/DownloadFragment;->t0()LR1/A;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/anilab/android/ui/download/DownloadFragment;->T0:Lb5/G1;

    .line 20
    .line 21
    invoke-virtual {v1}, Lb5/G1;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, LR1/s;

    .line 26
    .line 27
    iget-object v1, v1, LR1/s;->a:Lcom/anilab/domain/model/Movie;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v3, LR1/z;

    .line 33
    .line 34
    iget-wide v4, v1, Lcom/anilab/domain/model/Movie;->a:J

    .line 35
    .line 36
    invoke-direct {v3, v0, v4, v5, v2}, LR1/z;-><init>(LR1/A;JLE7/d;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-virtual {v0, v1, v3}, LM1/r;->d(ZLO7/p;)LY7/y0;

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

.method public final q0(LW/g;)Ljava/util/List;
    .locals 3

    .line 1
    check-cast p1, LJ1/g;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/g;->v:Lcom/google/android/material/button/MaterialButton;

    .line 4
    .line 5
    iget-object p1, p1, LJ1/g;->w:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    new-array v1, v1, [Lcom/google/android/material/button/MaterialButton;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object v0, v1, v2

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    aput-object p1, v1, v0

    .line 15
    .line 16
    invoke-static {v1}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final r0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/g;

    .line 6
    .line 7
    iget-object v1, v0, LJ1/g;->C:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/anilab/android/ui/download/DownloadFragment;->U0:LA7/l;

    .line 14
    .line 15
    invoke-virtual {v2}, LA7/l;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, LR1/C;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LF0/S;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/anilab/android/ui/download/DownloadFragment;->V0:LA7/l;

    .line 25
    .line 26
    invoke-virtual {v1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, LR1/E;

    .line 31
    .line 32
    iget-object v2, v0, LJ1/g;->D:Lcom/anilab/android/ui/views/FreakSpinner;

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Lp/L;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, LI5/k;

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    invoke-direct {v1, v0, v2, p0}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v0, LJ1/g;->x:Landroidx/appcompat/widget/AppCompatImageView;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, v0, LJ1/g;->z:Landroidx/appcompat/widget/AppCompatEditText;

    .line 49
    .line 50
    const-string v2, "inputSearchEpisode"

    .line 51
    .line 52
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v2, LR1/q;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-direct {v2, v0, p0, v3}, LR1/q;-><init>(LW/g;Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, LR1/b;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-direct {v0, v2, p0}, LR1/b;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 71
    .line 72
    .line 73
    return-void
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

.method public final t0()LR1/A;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/download/DownloadFragment;->S0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR1/A;

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
