.class public final Lcom/anilab/android/ui/loginWithEmail/LoginWithEmailFragment;
.super LZ1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LZ1/a<",
        "LZ1/h;",
        "LJ1/W;",
        ">;"
    }
.end annotation


# instance fields
.field public final D0:LY2/r;

.field public final E0:Li0/o;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, LZ1/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LN1/r;

    .line 5
    .line 6
    const/16 v1, 0x12

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
    const/16 v3, 0x13

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
    const-class v1, LZ1/h;

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
    const/16 v3, 0x18

    .line 33
    .line 34
    invoke-direct {v2, v0, v3}, LN1/s;-><init>(LA7/e;I)V

    .line 35
    .line 36
    .line 37
    new-instance v3, LN1/s;

    .line 38
    .line 39
    const/16 v4, 0x19

    .line 40
    .line 41
    invoke-direct {v3, v0, v4}, LN1/s;-><init>(LA7/e;I)V

    .line 42
    .line 43
    .line 44
    new-instance v4, LN1/t;

    .line 45
    .line 46
    const/16 v5, 0xc

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
    iput-object v0, p0, Lcom/anilab/android/ui/loginWithEmail/LoginWithEmailFragment;->D0:LY2/r;

    .line 56
    .line 57
    new-instance v0, Lg/a;

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    invoke-direct {v0, v1}, Lg/a;-><init>(I)V

    .line 61
    .line 62
    .line 63
    new-instance v1, LC3/v;

    .line 64
    .line 65
    const/16 v2, 0xb

    .line 66
    .line 67
    invoke-direct {v1, v2, p0}, LC3/v;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1, v0}, Li0/v;->V(Lf/b;Lv4/e;)Lf/c;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Li0/o;

    .line 75
    .line 76
    iput-object v0, p0, Lcom/anilab/android/ui/loginWithEmail/LoginWithEmailFragment;->E0:Li0/o;

    .line 77
    .line 78
    return-void
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
.method public final f0()I
    .locals 1

    .line 1
    const v0, 0x7f0d0053

    return v0
.end method

.method public final h0()LM1/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/loginWithEmail/LoginWithEmailFragment;->D0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LZ1/h;

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
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/loginWithEmail/LoginWithEmailFragment;->D0:LY2/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sparse-switch p1, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :sswitch_0
    const p1, 0x7f0a0228

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v1}, LM1/n;->i0(ILandroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :sswitch_1
    invoke-virtual {p0}, Li0/v;->k()Li0/y;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/Y1;->p(Landroid/app/Activity;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, LZ1/h;

    .line 29
    .line 30
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, LJ1/W;

    .line 35
    .line 36
    iget-object v0, v0, LJ1/W;->y:Lcom/google/android/material/textfield/TextInputEditText;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, LJ1/W;

    .line 51
    .line 52
    iget-object v2, v2, LJ1/W;->z:Lcom/google/android/material/textfield/TextInputEditText;

    .line 53
    .line 54
    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v3, LZ1/f;

    .line 66
    .line 67
    invoke-direct {v3, p1, v0, v2, v1}, LZ1/f;-><init>(LZ1/h;Ljava/lang/String;Ljava/lang/String;LE7/d;)V

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-virtual {p1, v0, v3}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :sswitch_2
    invoke-virtual {p0}, Li0/v;->k()Li0/y;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, LZ1/h;

    .line 86
    .line 87
    iget-object v0, v0, LZ1/h;->h:LP2/h;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v0, Lg6/o;->a:Lg6/o;

    .line 93
    .line 94
    invoke-virtual {v0}, Lg6/o;->J()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object v1, p0, Lcom/anilab/android/ui/loginWithEmail/LoginWithEmailFragment;->E0:Li0/o;

    .line 99
    .line 100
    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/Y1;->B(Li0/y;Li0/o;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    :goto_0
    return-void

    .line 104
    :sswitch_3
    invoke-static {p0}, LM1/n;->q0(LM1/n;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    nop

    .line 109
    :sswitch_data_0
    .sparse-switch
        0x7f0a0071 -> :sswitch_3
        0x7f0a007b -> :sswitch_2
        0x7f0a00a7 -> :sswitch_1
        0x7f0a03d8 -> :sswitch_0
    .end sparse-switch
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

.method public final l0()V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LZ1/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2, p0}, LZ1/d;-><init>(LE7/d;Lcom/anilab/android/ui/loginWithEmail/LoginWithEmailFragment;)V

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
    .locals 6

    .line 1
    check-cast p1, LJ1/W;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/W;->A:LJ1/E1;

    .line 4
    .line 5
    iget-object v0, v0, LW/g;->k:Landroid/view/View;

    .line 6
    .line 7
    iget-object v1, p1, LJ1/W;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    iget-object v2, p1, LJ1/W;->w:Lcom/google/android/material/button/MaterialButton;

    .line 10
    .line 11
    iget-object v3, p1, LJ1/W;->B:Landroidx/appcompat/widget/AppCompatTextView;

    .line 12
    .line 13
    iget-object p1, p1, LJ1/W;->x:Lcom/google/android/material/button/MaterialButton;

    .line 14
    .line 15
    const/4 v4, 0x5

    .line 16
    new-array v4, v4, [Landroid/view/View;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    aput-object v1, v4, v5

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    aput-object v3, v4, v1

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    aput-object p1, v4, v1

    .line 26
    .line 27
    const/4 p1, 0x3

    .line 28
    aput-object v0, v4, p1

    .line 29
    .line 30
    const/4 p1, 0x4

    .line 31
    aput-object v2, v4, p1

    .line 32
    .line 33
    invoke-static {v4}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
    .line 38
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
    check-cast v0, LJ1/W;

    .line 6
    .line 7
    iget-object v0, v0, LJ1/W;->A:LJ1/E1;

    .line 8
    .line 9
    iget-object v0, v0, LW/g;->k:Landroid/view/View;

    .line 10
    .line 11
    const-string v1, "getRoot(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 p1, 0x8

    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    return-void
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
    .locals 0

    .line 1
    return-void
.end method
