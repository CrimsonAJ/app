.class public final Lcom/anilab/android/ui/home/HomeFragment;
.super LX1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LX1/d<",
        "LX1/y;",
        "LJ1/P;",
        ">;"
    }
.end annotation


# instance fields
.field public final F0:LY2/r;

.field public final G0:LA7/l;

.field public H0:LX1/H;

.field public I0:LY7/y0;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, LX1/d;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LN1/r;

    .line 5
    .line 6
    const/16 v1, 0xf

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, LN1/r;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, LA7/f;->a:LA7/f;

    .line 12
    .line 13
    new-instance v2, LN1/r;

    .line 14
    .line 15
    const/16 v3, 0x10

    .line 16
    .line 17
    invoke-direct {v2, v3, v0}, LN1/r;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-class v1, LX1/y;

    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, LN1/s;

    .line 31
    .line 32
    const/16 v3, 0x14

    .line 33
    .line 34
    invoke-direct {v2, v0, v3}, LN1/s;-><init>(LA7/e;I)V

    .line 35
    .line 36
    .line 37
    new-instance v3, LN1/s;

    .line 38
    .line 39
    const/16 v4, 0x15

    .line 40
    .line 41
    invoke-direct {v3, v0, v4}, LN1/s;-><init>(LA7/e;I)V

    .line 42
    .line 43
    .line 44
    new-instance v4, LN1/t;

    .line 45
    .line 46
    const/16 v5, 0xa

    .line 47
    .line 48
    invoke-direct {v4, p0, v0, v5}, LN1/t;-><init>(Li0/v;LA7/e;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lcom/anilab/android/ui/home/HomeFragment;->F0:LY2/r;

    .line 56
    .line 57
    new-instance v0, LB2/i;

    .line 58
    .line 59
    const/4 v1, 0x7

    .line 60
    invoke-direct {v0, v1, p0}, LB2/i;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, Lcom/anilab/android/ui/home/HomeFragment;->G0:LA7/l;

    .line 68
    .line 69
    return-void
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


# virtual methods
.method public final A0(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/P;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/anilab/android/ui/home/HomeFragment;->H0:LX1/H;

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-object v1, v1, LX1/H;->e:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 18
    .line 19
    iget-boolean p1, p1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const v1, 0x7f060057

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const v1, 0x7f060382

    .line 28
    .line 29
    .line 30
    :goto_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const p1, 0x7f080263

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const p1, 0x7f080156

    .line 37
    .line 38
    .line 39
    :goto_1
    iget-object v2, v0, LJ1/P;->v:Lcom/google/android/material/button/MaterialButton;

    .line 40
    .line 41
    invoke-virtual {v2, p1}, Lcom/google/android/material/button/MaterialButton;->setIconResource(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v0, LW/g;->k:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v1}, Lcom/google/android/material/button/MaterialButton;->setIconTintResource(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Lcom/google/android/material/button/MaterialButton;->setStrokeColorResource(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    const-string p1, "sliderAdapter"

    .line 65
    .line 66
    invoke-static {p1}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    throw p1
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

.method public final N()V
    .locals 2

    .line 1
    invoke-super {p0}, LM1/n;->N()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/anilab/android/ui/home/HomeFragment;->I0:LY7/y0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, LY7/r0;->d(Ljava/util/concurrent/CancellationException;)V

    .line 10
    .line 11
    .line 12
    :cond_0
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

.method public final O()V
    .locals 0

    .line 1
    invoke-super {p0}, LM1/n;->O()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/anilab/android/ui/home/HomeFragment;->x0()V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public final f0()I
    .locals 1

    .line 1
    const v0, 0x7f0d0050

    return v0
.end method

.method public final bridge synthetic h0()LM1/r;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/anilab/android/ui/home/HomeFragment;->y0()LX1/y;

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
    .locals 10

    .line 1
    const-string v0, "sliderAdapter"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sparse-switch p1, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :sswitch_0
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p1, v1

    .line 17
    :goto_0
    instance-of v0, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-object p1, v1

    .line 25
    :goto_1
    if-eqz p1, :cond_9

    .line 26
    .line 27
    const v0, 0x7f0a018f

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :sswitch_1
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move-object p1, v1

    .line 42
    :goto_2
    instance-of v0, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    check-cast p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move-object p1, v1

    .line 50
    :goto_3
    if-eqz p1, :cond_9

    .line 51
    .line 52
    const v0, 0x7f0a01ab

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :sswitch_2
    invoke-virtual {p0}, Li0/v;->k()Li0/y;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_9

    .line 64
    .line 65
    iget-object p1, p0, Lcom/anilab/android/ui/home/HomeFragment;->H0:LX1/H;

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    iget-object p1, p1, LX1/H;->e:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, LJ1/P;

    .line 76
    .line 77
    iget-object v0, v0, LJ1/P;->B:Landroidx/viewpager2/widget/ViewPager2;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {p1, v0}, LB7/k;->r0(Ljava/util/List;I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 88
    .line 89
    if-eqz p1, :cond_9

    .line 90
    .line 91
    new-instance v0, LH2/s;

    .line 92
    .line 93
    iget v7, p1, Lcom/anilab/domain/model/Movie;->g:I

    .line 94
    .line 95
    iget-object v8, p1, Lcom/anilab/domain/model/Movie;->d:Ljava/util/List;

    .line 96
    .line 97
    iget-wide v1, p1, Lcom/anilab/domain/model/Movie;->a:J

    .line 98
    .line 99
    iget-object v3, p1, Lcom/anilab/domain/model/Movie;->c:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v4, p1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 102
    .line 103
    const-wide/16 v5, 0x0

    .line 104
    .line 105
    const/16 v9, 0x8

    .line 106
    .line 107
    invoke-direct/range {v0 .. v9}, LH2/s;-><init>(JLjava/lang/String;Ljava/lang/String;JILjava/util/List;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0}, LM1/B;->t0(LH2/s;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_4
    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :sswitch_3
    invoke-virtual {p0}, Lcom/anilab/android/ui/home/HomeFragment;->y0()LX1/y;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object p1, p1, LX1/y;->k:LP2/e;

    .line 123
    .line 124
    iget-object p1, p1, LP2/e;->a:LC2/g0;

    .line 125
    .line 126
    invoke-virtual {p1}, LC2/g0;->b()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-nez p1, :cond_7

    .line 131
    .line 132
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 133
    .line 134
    if-eqz p1, :cond_5

    .line 135
    .line 136
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_5
    move-object p1, v1

    .line 140
    :goto_4
    instance-of v0, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 141
    .line 142
    if-eqz v0, :cond_6

    .line 143
    .line 144
    move-object v1, p1

    .line 145
    check-cast v1, Lcom/anilab/android/ui/main/HostFragment;

    .line 146
    .line 147
    :cond_6
    if-eqz v1, :cond_9

    .line 148
    .line 149
    new-instance p1, Lu0/a;

    .line 150
    .line 151
    const v0, 0x7f0a018d

    .line 152
    .line 153
    .line 154
    invoke-direct {p1, v0}, Lu0/a;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, p1}, LM1/n;->j0(Lu0/D;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_7
    iget-object p1, p0, Lcom/anilab/android/ui/home/HomeFragment;->H0:LX1/H;

    .line 162
    .line 163
    if-eqz p1, :cond_a

    .line 164
    .line 165
    iget-object p1, p1, LX1/H;->e:Ljava/lang/Object;

    .line 166
    .line 167
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, LJ1/P;

    .line 172
    .line 173
    iget-object v2, v2, LJ1/P;->B:Landroidx/viewpager2/widget/ViewPager2;

    .line 174
    .line 175
    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    invoke-static {p1, v2}, LB7/k;->r0(Ljava/util/List;I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 184
    .line 185
    if-eqz p1, :cond_9

    .line 186
    .line 187
    iget-object v2, p0, Lcom/anilab/android/ui/home/HomeFragment;->H0:LX1/H;

    .line 188
    .line 189
    if-eqz v2, :cond_8

    .line 190
    .line 191
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, LJ1/P;

    .line 196
    .line 197
    iget-object v0, v0, LJ1/P;->B:Landroidx/viewpager2/widget/ViewPager2;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    iget-object v1, v2, LX1/H;->e:Ljava/lang/Object;

    .line 204
    .line 205
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, Lcom/anilab/domain/model/Movie;

    .line 210
    .line 211
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, Lcom/anilab/domain/model/Movie;

    .line 216
    .line 217
    iget-boolean v0, v0, Lcom/anilab/domain/model/Movie;->p:Z

    .line 218
    .line 219
    xor-int/lit8 v0, v0, 0x1

    .line 220
    .line 221
    iput-boolean v0, v2, Lcom/anilab/domain/model/Movie;->p:Z

    .line 222
    .line 223
    invoke-virtual {p0}, Lcom/anilab/android/ui/home/HomeFragment;->y0()LX1/y;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    iget-boolean v4, p1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 228
    .line 229
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    new-instance v3, LX1/x;

    .line 233
    .line 234
    const/4 v8, 0x0

    .line 235
    iget-wide v6, p1, Lcom/anilab/domain/model/Movie;->a:J

    .line 236
    .line 237
    invoke-direct/range {v3 .. v8}, LX1/x;-><init>(ZLX1/y;JLE7/d;)V

    .line 238
    .line 239
    .line 240
    const/4 p1, 0x0

    .line 241
    invoke-virtual {v5, p1, v3}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    check-cast p1, LJ1/P;

    .line 249
    .line 250
    iget-object p1, p1, LJ1/P;->B:Landroidx/viewpager2/widget/ViewPager2;

    .line 251
    .line 252
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    invoke-virtual {p0, p1}, Lcom/anilab/android/ui/home/HomeFragment;->A0(I)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_8
    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v1

    .line 264
    :cond_9
    :goto_5
    return-void

    .line 265
    :cond_a
    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v1

    .line 269
    :sswitch_data_0
    .sparse-switch
        0x7f0a006d -> :sswitch_3
        0x7f0a0096 -> :sswitch_2
        0x7f0a01c4 -> :sswitch_1
        0x7f0a01cb -> :sswitch_0
    .end sparse-switch
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
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
    .locals 4

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
    new-instance v1, LX1/o;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2, p0}, LX1/o;-><init>(LE7/d;Lcom/anilab/android/ui/home/HomeFragment;)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/anilab/android/ui/home/HomeFragment;->y0()LX1/y;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v1, LX1/v;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v1, v0, v3, v2}, LX1/v;-><init>(LX1/y;ZLE7/d;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3, v1}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
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

.method public final m0(LW/g;)Ljava/util/List;
    .locals 5

    .line 1
    check-cast p1, LJ1/P;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/P;->v:Lcom/google/android/material/button/MaterialButton;

    .line 4
    .line 5
    iget-object v1, p1, LJ1/P;->w:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    iget-object v2, p1, LJ1/P;->x:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    iget-object p1, p1, LJ1/P;->y:Landroidx/appcompat/widget/AppCompatImageView;

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    new-array v3, v3, [Landroid/view/View;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    aput-object v2, v3, v4

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    aput-object p1, v3, v2

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    aput-object v0, v3, p1

    .line 22
    .line 23
    const/4 p1, 0x3

    .line 24
    aput-object v1, v3, p1

    .line 25
    .line 26
    invoke-static {v3}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final n0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Li0/v;->v:Li0/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Li0/v;->v:Li0/v;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    instance-of v2, v0, Lcom/anilab/android/ui/main/HostFragment;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Lcom/anilab/android/ui/main/HostFragment;

    .line 16
    .line 17
    :cond_1
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lcom/anilab/android/ui/main/HostFragment;->n0(Z)V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
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

.method public final p0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/P;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/anilab/android/ui/home/HomeFragment;->G0:LA7/l;

    .line 8
    .line 9
    invoke-virtual {v1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, LX1/F;

    .line 14
    .line 15
    iget-object v0, v0, LJ1/P;->z:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LF0/S;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, LJ1/P;

    .line 25
    .line 26
    new-instance v1, LX1/p;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v1, v2, p0}, LX1/p;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, LJ1/P;->B:Landroidx/viewpager2/widget/ViewPager2;

    .line 33
    .line 34
    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2;->c:LX1/p;

    .line 35
    .line 36
    iget-object v0, v0, LX1/p;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, LJ1/P;

    .line 48
    .line 49
    new-instance v1, LC3/v;

    .line 50
    .line 51
    const/16 v2, 0x9

    .line 52
    .line 53
    invoke-direct {v1, v2, p0}, LC3/v;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, LJ1/P;->A:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(LV0/i;)V

    .line 59
    .line 60
    .line 61
    return-void
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

.method public final u0()V
    .locals 3

    .line 1
    iget-object v0, p0, Li0/v;->v:Li0/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Li0/v;->v:Li0/v;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    instance-of v2, v0, Lcom/anilab/android/ui/main/HostFragment;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Lcom/anilab/android/ui/main/HostFragment;

    .line 16
    .line 17
    :cond_1
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/anilab/android/ui/main/HostFragment;->u0()V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
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
    .locals 3

    .line 1
    iget-object v0, p0, Li0/v;->v:Li0/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Li0/v;->v:Li0/v;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    instance-of v2, v0, Lcom/anilab/android/ui/main/HostFragment;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Lcom/anilab/android/ui/main/HostFragment;

    .line 16
    .line 17
    :cond_1
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/anilab/android/ui/main/HostFragment;->v0()V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
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

.method public final x0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/home/HomeFragment;->I0:LY7/y0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, LY7/r0;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, LX1/e;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, v2, p0}, LX1/e;-><init>(LE7/d;Lcom/anilab/android/ui/home/HomeFragment;)V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x3

    .line 24
    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lcom/anilab/android/ui/home/HomeFragment;->I0:LY7/y0;

    .line 29
    .line 30
    invoke-virtual {v0}, LY7/r0;->start()Z

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
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

.method public final y0()LX1/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/home/HomeFragment;->F0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LX1/y;

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
    .locals 3

    .line 1
    const-string v0, "movie"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li0/v;->v:Li0/v;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Li0/v;->v:Li0/v;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v1

    .line 15
    :goto_0
    instance-of v2, v0, Lcom/anilab/android/ui/main/HostFragment;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Lcom/anilab/android/ui/main/HostFragment;

    .line 21
    .line 22
    :cond_1
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-static {v1, p1}, Lcom/anilab/android/ui/main/HostFragment;->y0(Lcom/anilab/android/ui/main/HostFragment;Lcom/anilab/domain/model/Movie;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    return-void
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
