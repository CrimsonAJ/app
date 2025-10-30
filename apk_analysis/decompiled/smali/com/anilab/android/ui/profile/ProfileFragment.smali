.class public final Lcom/anilab/android/ui/profile/ProfileFragment;
.super Lh2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh2/a<",
        "Lh2/g;",
        "LJ1/m0;",
        ">;"
    }
.end annotation


# instance fields
.field public final D0:LY2/r;

.field public final E0:LY2/r;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lh2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh2/e;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, p0, v1}, Lh2/e;-><init>(Lcom/anilab/android/ui/profile/ProfileFragment;I)V

    .line 8
    .line 9
    .line 10
    sget-object v1, LA7/f;->a:LA7/f;

    .line 11
    .line 12
    new-instance v2, Le2/e;

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    invoke-direct {v2, v3, v0}, Le2/e;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-class v1, Lh2/g;

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
    const/16 v3, 0xe

    .line 31
    .line 32
    invoke-direct {v2, v0, v3}, Lc2/h;-><init>(LA7/e;I)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Lc2/h;

    .line 36
    .line 37
    const/16 v4, 0xf

    .line 38
    .line 39
    invoke-direct {v3, v0, v4}, Lc2/h;-><init>(LA7/e;I)V

    .line 40
    .line 41
    .line 42
    new-instance v4, LN1/t;

    .line 43
    .line 44
    const/16 v5, 0x16

    .line 45
    .line 46
    invoke-direct {v4, p0, v0, v5}, LN1/t;-><init>(Li0/v;LA7/e;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/anilab/android/ui/profile/ProfileFragment;->D0:LY2/r;

    .line 54
    .line 55
    const-class v0, LL1/S;

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Lh2/e;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-direct {v1, p0, v2}, Lh2/e;-><init>(Lcom/anilab/android/ui/profile/ProfileFragment;I)V

    .line 65
    .line 66
    .line 67
    new-instance v2, Lh2/e;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-direct {v2, p0, v3}, Lh2/e;-><init>(Lcom/anilab/android/ui/profile/ProfileFragment;I)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lh2/e;

    .line 74
    .line 75
    const/4 v4, 0x2

    .line 76
    invoke-direct {v3, p0, v4}, Lh2/e;-><init>(Lcom/anilab/android/ui/profile/ProfileFragment;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v0, v1, v2, v3}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, Lcom/anilab/android/ui/profile/ProfileFragment;->E0:LY2/r;

    .line 84
    .line 85
    return-void
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
.method public final O()V
    .locals 0

    .line 1
    invoke-super {p0}, LM1/n;->O()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/anilab/android/ui/profile/ProfileFragment;->s0()LA7/n;

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
    const v0, 0x7f0d005b

    return v0
.end method

.method public final h0()LM1/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/profile/ProfileFragment;->D0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lh2/g;

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

.method public final k0(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    sparse-switch p1, :sswitch_data_0

    .line 3
    .line 4
    .line 5
    goto/16 :goto_f

    .line 6
    .line 7
    :sswitch_0
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p1, v0

    .line 15
    :goto_0
    instance-of v1, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    check-cast p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object p1, v0

    .line 23
    :goto_1
    if-eqz p1, :cond_10

    .line 24
    .line 25
    const v1, 0x7f0a01af

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1, v0}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :sswitch_1
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move-object p1, v0

    .line 40
    :goto_2
    instance-of v1, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    check-cast p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    move-object p1, v0

    .line 48
    :goto_3
    if-eqz p1, :cond_10

    .line 49
    .line 50
    const v1, 0x7f0a01ad

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1, v0}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :sswitch_2
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_4
    move-object p1, v0

    .line 65
    :goto_4
    instance-of v1, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    check-cast p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_5
    move-object p1, v0

    .line 73
    :goto_5
    if-eqz p1, :cond_10

    .line 74
    .line 75
    const v1, 0x7f0a01ac

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1, v0}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :sswitch_3
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 83
    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_6
    move-object p1, v0

    .line 90
    :goto_6
    instance-of v1, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 91
    .line 92
    if-eqz v1, :cond_7

    .line 93
    .line 94
    check-cast p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 95
    .line 96
    goto :goto_7

    .line 97
    :cond_7
    move-object p1, v0

    .line 98
    :goto_7
    if-eqz p1, :cond_10

    .line 99
    .line 100
    const v1, 0x7f0a01a7

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v1, v0}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :sswitch_4
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 108
    .line 109
    if-eqz p1, :cond_8

    .line 110
    .line 111
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 112
    .line 113
    goto :goto_8

    .line 114
    :cond_8
    move-object p1, v0

    .line 115
    :goto_8
    instance-of v1, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 116
    .line 117
    if-eqz v1, :cond_9

    .line 118
    .line 119
    check-cast p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 120
    .line 121
    goto :goto_9

    .line 122
    :cond_9
    move-object p1, v0

    .line 123
    :goto_9
    if-eqz p1, :cond_10

    .line 124
    .line 125
    const v1, 0x7f0a01aa

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v1, v0}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :sswitch_5
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 133
    .line 134
    if-eqz p1, :cond_a

    .line 135
    .line 136
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 137
    .line 138
    goto :goto_a

    .line 139
    :cond_a
    move-object p1, v0

    .line 140
    :goto_a
    instance-of v1, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 141
    .line 142
    if-eqz v1, :cond_b

    .line 143
    .line 144
    check-cast p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 145
    .line 146
    goto :goto_b

    .line 147
    :cond_b
    move-object p1, v0

    .line 148
    :goto_b
    if-eqz p1, :cond_10

    .line 149
    .line 150
    const v1, 0x7f0a01a9

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v1, v0}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :sswitch_6
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 158
    .line 159
    if-eqz p1, :cond_c

    .line 160
    .line 161
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 162
    .line 163
    goto :goto_c

    .line 164
    :cond_c
    move-object p1, v0

    .line 165
    :goto_c
    instance-of v1, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 166
    .line 167
    if-eqz v1, :cond_d

    .line 168
    .line 169
    check-cast p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 170
    .line 171
    goto :goto_d

    .line 172
    :cond_d
    move-object p1, v0

    .line 173
    :goto_d
    if-eqz p1, :cond_10

    .line 174
    .line 175
    const v1, 0x7f0a01a8

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v1, v0}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :sswitch_7
    iget-object p1, p0, Li0/v;->v:Li0/v;

    .line 183
    .line 184
    if-eqz p1, :cond_e

    .line 185
    .line 186
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 187
    .line 188
    goto :goto_e

    .line 189
    :cond_e
    move-object p1, v0

    .line 190
    :goto_e
    instance-of v1, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 191
    .line 192
    if-eqz v1, :cond_f

    .line 193
    .line 194
    move-object v0, p1

    .line 195
    check-cast v0, Lcom/anilab/android/ui/main/HostFragment;

    .line 196
    .line 197
    :cond_f
    if-eqz v0, :cond_10

    .line 198
    .line 199
    new-instance p1, Lu0/a;

    .line 200
    .line 201
    const v1, 0x7f0a018d

    .line 202
    .line 203
    .line 204
    invoke-direct {p1, v1}, Lu0/a;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, p1}, LM1/n;->j0(Lu0/D;)V

    .line 208
    .line 209
    .line 210
    :cond_10
    :goto_f
    return-void

    .line 211
    :sswitch_data_0
    .sparse-switch
        0x7f0a007a -> :sswitch_7
        0x7f0a007f -> :sswitch_6
        0x7f0a0086 -> :sswitch_5
        0x7f0a0088 -> :sswitch_4
        0x7f0a008e -> :sswitch_3
        0x7f0a0097 -> :sswitch_2
        0x7f0a00a1 -> :sswitch_1
        0x7f0a00ad -> :sswitch_0
    .end sparse-switch
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

.method public final l0()V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lh2/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2, p0}, Lh2/d;-><init>(LE7/d;Lcom/anilab/android/ui/profile/ProfileFragment;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final m0(LW/g;)Ljava/util/List;
    .locals 9

    .line 1
    check-cast p1, LJ1/m0;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/m0;->y:Lcom/anilab/android/ui/views/ButtonSettings;

    .line 4
    .line 5
    iget-object v1, p1, LJ1/m0;->A:Lcom/anilab/android/ui/views/ButtonSettings;

    .line 6
    .line 7
    iget-object v2, p1, LJ1/m0;->w:Lcom/anilab/android/ui/views/ButtonSettings;

    .line 8
    .line 9
    iget-object v3, p1, LJ1/m0;->z:Lcom/anilab/android/ui/views/ButtonSettings;

    .line 10
    .line 11
    iget-object v4, p1, LJ1/m0;->v:Lcom/google/android/material/button/MaterialButton;

    .line 12
    .line 13
    iget-object v5, p1, LJ1/m0;->B:Lcom/anilab/android/ui/views/ButtonSettings;

    .line 14
    .line 15
    iget-object v6, p1, LJ1/m0;->x:Lcom/anilab/android/ui/views/ButtonSettings;

    .line 16
    .line 17
    iget-object p1, p1, LJ1/m0;->C:Lcom/anilab/android/ui/views/ButtonSettings;

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

.method public final p0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/anilab/android/ui/profile/ProfileFragment;->s0()LA7/n;

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
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

.method public final s0()LA7/n;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    check-cast v1, LJ1/m0;

    .line 7
    .line 8
    iget-object v2, v1, LJ1/m0;->D:Landroidx/constraintlayout/widget/Group;

    .line 9
    .line 10
    const-string v3, "groupProfile"

    .line 11
    .line 12
    invoke-static {v2, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v3, p0, Lcom/anilab/android/ui/profile/ProfileFragment;->D0:LY2/r;

    .line 16
    .line 17
    invoke-virtual {v3}, LY2/r;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lh2/g;

    .line 22
    .line 23
    iget-object v4, v4, Lh2/g;->g:LP2/e;

    .line 24
    .line 25
    iget-object v4, v4, LP2/e;->a:LC2/g0;

    .line 26
    .line 27
    invoke-virtual {v4}, LC2/g0;->b()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/16 v5, 0x8

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    move v4, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v4, v5

    .line 38
    :goto_0
    invoke-virtual {v2, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    iget-object v2, v1, LJ1/m0;->E:Landroidx/constraintlayout/widget/Group;

    .line 42
    .line 43
    const-string v4, "groupSignInRequire"

    .line 44
    .line 45
    invoke-static {v2, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, LY2/r;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lh2/g;

    .line 53
    .line 54
    iget-object v4, v4, Lh2/g;->g:LP2/e;

    .line 55
    .line 56
    iget-object v4, v4, LP2/e;->a:LC2/g0;

    .line 57
    .line 58
    invoke-virtual {v4}, LC2/g0;->b()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move v5, v0

    .line 66
    :goto_1
    invoke-virtual {v2, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, LY2/r;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lh2/g;

    .line 74
    .line 75
    iget-object v2, v2, Lh2/g;->f:LP2/i;

    .line 76
    .line 77
    invoke-virtual {v2}, LP2/i;->a()LH2/y;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const/4 v3, 0x0

    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    iget-object v4, v1, LJ1/m0;->F:Landroidx/appcompat/widget/AppCompatImageView;

    .line 85
    .line 86
    const-string v5, "imageAvatar"

    .line 87
    .line 88
    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v5, v2, LH2/y;->d:Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v5, :cond_2

    .line 94
    .line 95
    const-string v3, "150x150"

    .line 96
    .line 97
    const-string v6, "250x250"

    .line 98
    .line 99
    invoke-static {v5, v3, v6}, LW7/l;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-static {v5}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    new-instance v6, LC1/h;

    .line 112
    .line 113
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-direct {v6, v7}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    iput-object v3, v6, LC1/h;->c:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-virtual {v6, v4}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 123
    .line 124
    .line 125
    new-instance v3, LF1/a;

    .line 126
    .line 127
    invoke-direct {v3}, LF1/a;-><init>()V

    .line 128
    .line 129
    .line 130
    const/4 v4, 0x1

    .line 131
    new-array v4, v4, [LF1/c;

    .line 132
    .line 133
    aput-object v3, v4, v0

    .line 134
    .line 135
    invoke-static {v4}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, v6, LC1/h;->e:Ljava/util/List;

    .line 144
    .line 145
    invoke-virtual {v6}, LC1/h;->a()LC1/i;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v5, v0}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 150
    .line 151
    .line 152
    iget-object v0, v2, LH2/y;->b:Ljava/lang/String;

    .line 153
    .line 154
    iget-object v3, v1, LJ1/m0;->G:Landroidx/appcompat/widget/AppCompatTextView;

    .line 155
    .line 156
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, v2, LH2/y;->c:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v1, v1, LJ1/m0;->H:Landroidx/appcompat/widget/AppCompatTextView;

    .line 162
    .line 163
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    sget-object v0, LA7/n;->a:LA7/n;

    .line 167
    .line 168
    return-object v0

    .line 169
    :cond_3
    return-object v3
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
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
.end method
