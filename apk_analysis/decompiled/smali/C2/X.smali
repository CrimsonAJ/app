.class public final LC2/X;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public r:Lcom/anilab/data/model/response/UserInfoResponse;

.field public s:Lcom/anilab/data/model/response/LoginResponse;

.field public t:I

.field public final synthetic u:LC2/g0;


# direct methods
.method public constructor <init>(LC2/g0;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC2/X;->u:LC2/g0;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

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
    .line 33
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 1

    .line 1
    new-instance p1, LC2/X;

    .line 2
    .line 3
    iget-object v0, p0, LC2/X;->u:LC2/g0;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LC2/X;-><init>(LC2/g0;LE7/d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
    .line 33
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LC2/X;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LC2/X;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LC2/X;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
    .line 33
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, LC2/X;->t:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object v4, p0, LC2/X;->u:LC2/g0;

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v2, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LC2/X;->s:Lcom/anilab/data/model/response/LoginResponse;

    .line 16
    .line 17
    iget-object v1, p0, LC2/X;->r:Lcom/anilab/data/model/response/UserInfoResponse;

    .line 18
    .line 19
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v4, LC2/g0;->a:LB2/b;

    .line 39
    .line 40
    iget-object v1, v4, LC2/g0;->b:Ly2/a;

    .line 41
    .line 42
    invoke-static {v1}, LO4/h;->t(Ly2/a;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    sget-object v5, Lg6/o;->a:Lg6/o;

    .line 47
    .line 48
    invoke-virtual {v5}, Lg6/o;->X0()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/measurement/k1;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput v2, p0, LC2/X;->t:I

    .line 57
    .line 58
    invoke-interface {p1, v1, p0}, LB2/b;->y(Ljava/lang/String;LE7/d;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    check-cast p1, Lcom/anilab/data/model/response/ApiResponse;

    .line 66
    .line 67
    iget-object p1, p1, Lcom/anilab/data/model/response/ApiResponse;->c:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v1, p1

    .line 70
    check-cast v1, Lcom/anilab/data/model/response/UserInfoResponse;

    .line 71
    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    invoke-virtual {v4}, LC2/g0;->a()Lcom/anilab/data/model/response/LoginResponse;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v2, v4, LC2/g0;->a:LB2/b;

    .line 79
    .line 80
    iget-object v5, v4, LC2/g0;->b:Ly2/a;

    .line 81
    .line 82
    invoke-static {v5}, LO4/h;->t(Ly2/a;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    sget-object v6, Lg6/o;->a:Lg6/o;

    .line 87
    .line 88
    invoke-virtual {v6}, Lg6/o;->v0()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/k1;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    iput-object v1, p0, LC2/X;->r:Lcom/anilab/data/model/response/UserInfoResponse;

    .line 97
    .line 98
    iput-object p1, p0, LC2/X;->s:Lcom/anilab/data/model/response/LoginResponse;

    .line 99
    .line 100
    iput v3, p0, LC2/X;->t:I

    .line 101
    .line 102
    invoke-interface {v2, v5, p0}, LB2/b;->s(Ljava/lang/String;LE7/d;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    if-ne v2, v0, :cond_4

    .line 107
    .line 108
    :goto_1
    return-object v0

    .line 109
    :cond_4
    move-object v0, p1

    .line 110
    move-object p1, v2

    .line 111
    :goto_2
    check-cast p1, Lcom/anilab/data/model/response/ApiResponse;

    .line 112
    .line 113
    iget-object p1, p1, Lcom/anilab/data/model/response/ApiResponse;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, Lcom/anilab/data/model/response/WatchListIdResponse;

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    iget-object v2, v1, Lcom/anilab/data/model/response/UserInfoResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    .line 120
    .line 121
    iput-object v2, v0, Lcom/anilab/data/model/response/LoginResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    .line 122
    .line 123
    :cond_5
    iget-object v2, v4, LC2/g0;->b:Ly2/a;

    .line 124
    .line 125
    sget-object v3, Lg6/o;->a:Lg6/o;

    .line 126
    .line 127
    invoke-virtual {v3}, Lg6/o;->r0()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    iget-object v6, v2, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 132
    .line 133
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    iget-object v2, v2, Ly2/a;->b:Lo7/y;

    .line 138
    .line 139
    const-class v7, Lcom/anilab/data/model/response/WatchListIdResponse;

    .line 140
    .line 141
    invoke-virtual {v2, v7}, Lo7/y;->a(Ljava/lang/Class;)Lo7/k;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v2, p1}, Lo7/k;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-interface {v6, v5, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 150
    .line 151
    .line 152
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 153
    .line 154
    .line 155
    iget-object p1, v4, LC2/g0;->b:Ly2/a;

    .line 156
    .line 157
    invoke-virtual {v3}, Lg6/o;->o0()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iget-object v3, p1, Ly2/a;->a:Landroid/content/SharedPreferences;

    .line 162
    .line 163
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    iget-object p1, p1, Ly2/a;->b:Lo7/y;

    .line 168
    .line 169
    const-class v4, Lcom/anilab/data/model/response/LoginResponse;

    .line 170
    .line 171
    invoke-virtual {p1, v4}, Lo7/y;->a(Ljava/lang/Class;)Lo7/k;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p1, v0}, Lo7/k;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-interface {v3, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 180
    .line 181
    .line 182
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 183
    .line 184
    .line 185
    new-instance p1, Lv2/b;

    .line 186
    .line 187
    iget-object v0, v1, Lcom/anilab/data/model/response/UserInfoResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    .line 188
    .line 189
    invoke-direct {p1, v0}, Lv2/b;-><init>(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    return-object p1

    .line 193
    :cond_6
    new-instance p1, Lu2/a;

    .line 194
    .line 195
    const/4 v0, 0x0

    .line 196
    invoke-direct {p1, v0, v3}, Lu2/a;-><init>(Ljava/lang/String;I)V

    .line 197
    .line 198
    .line 199
    throw p1
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
