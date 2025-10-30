.class public final Lco/notix/zg;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/q;


# instance fields
.field public a:I

.field public synthetic b:Z

.field public synthetic c:Lco/notix/xa;

.field public final synthetic d:Lco/notix/ch;


# direct methods
.method public constructor <init>(Lco/notix/ch;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/zg;->d:Lco/notix/ch;

    .line 2
    .line 3
    const/4 p1, 0x3

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
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Lco/notix/xa;

    .line 8
    .line 9
    check-cast p3, LE7/d;

    .line 10
    .line 11
    new-instance v0, Lco/notix/zg;

    .line 12
    .line 13
    iget-object v1, p0, Lco/notix/zg;->d:Lco/notix/ch;

    .line 14
    .line 15
    invoke-direct {v0, v1, p3}, Lco/notix/zg;-><init>(Lco/notix/ch;LE7/d;)V

    .line 16
    .line 17
    .line 18
    iput-boolean p1, v0, Lco/notix/zg;->b:Z

    .line 19
    .line 20
    iput-object p2, v0, Lco/notix/zg;->c:Lco/notix/xa;

    .line 21
    .line 22
    sget-object p1, LA7/n;->a:LA7/n;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lco/notix/zg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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
    .line 109
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, Lco/notix/zg;->a:I

    .line 4
    .line 5
    sget-object v2, LA7/n;->a:LA7/n;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v4, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-boolean p1, p0, Lco/notix/zg;->b:Z

    .line 32
    .line 33
    iget-object v1, p0, Lco/notix/zg;->c:Lco/notix/xa;

    .line 34
    .line 35
    iget-object v5, p0, Lco/notix/zg;->d:Lco/notix/ch;

    .line 36
    .line 37
    iget-object v5, v5, Lco/notix/ch;->b:Lco/notix/xq;

    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object v5, Lco/notix/wq;->b:Lco/notix/d9;

    .line 43
    .line 44
    invoke-virtual {v5}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    const-string v6, "NOTIX_DEVICE_TOKEN"

    .line 49
    .line 50
    invoke-static {v5, v6}, Lco/notix/xq;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    instance-of v6, v1, Lco/notix/va;

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    if-eqz v6, :cond_4

    .line 58
    .line 59
    check-cast v1, Lco/notix/va;

    .line 60
    .line 61
    iget-object v6, v1, Lco/notix/va;->b:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v6, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-nez v6, :cond_4

    .line 68
    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p1, p1, Lco/notix/kd;->b:Lco/notix/x8;

    .line 77
    .line 78
    const-string v3, "updating push subscription state. subscribing!"

    .line 79
    .line 80
    invoke-virtual {p1, v3}, Lco/notix/x8;->b(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lco/notix/zg;->d:Lco/notix/ch;

    .line 84
    .line 85
    iget-object p1, p1, Lco/notix/ch;->j:Lco/notix/kl;

    .line 86
    .line 87
    iget-object v1, v1, Lco/notix/va;->b:Ljava/lang/String;

    .line 88
    .line 89
    iput v4, p0, Lco/notix/zg;->a:I

    .line 90
    .line 91
    iget-object v3, p1, Lco/notix/kl;->e:LY7/z;

    .line 92
    .line 93
    invoke-interface {v3}, LY7/z;->g()LE7/i;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    new-instance v4, Lco/notix/il;

    .line 98
    .line 99
    invoke-direct {v4, p1, v1, v7}, Lco/notix/il;-><init>(Lco/notix/kl;Ljava/lang/String;LE7/d;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v3, v4, p0}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v0, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    move-object p1, v2

    .line 110
    :goto_1
    if-ne p1, v0, :cond_6

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    if-eqz v5, :cond_6

    .line 114
    .line 115
    if-nez p1, :cond_6

    .line 116
    .line 117
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object p1, p1, Lco/notix/kd;->b:Lco/notix/x8;

    .line 123
    .line 124
    const-string v1, "updating push subscription state. unsubscribing!"

    .line 125
    .line 126
    invoke-virtual {p1, v1}, Lco/notix/x8;->b(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lco/notix/zg;->d:Lco/notix/ch;

    .line 130
    .line 131
    iget-object p1, p1, Lco/notix/ch;->j:Lco/notix/kl;

    .line 132
    .line 133
    iput v3, p0, Lco/notix/zg;->a:I

    .line 134
    .line 135
    iget-object v1, p1, Lco/notix/kl;->e:LY7/z;

    .line 136
    .line 137
    invoke-interface {v1}, LY7/z;->g()LE7/i;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    new-instance v3, Lco/notix/jl;

    .line 142
    .line 143
    invoke-direct {v3, p1, v7}, Lco/notix/jl;-><init>(Lco/notix/kl;LE7/d;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v3, p0}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-ne p1, v0, :cond_5

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_5
    move-object p1, v2

    .line 154
    :goto_2
    if-ne p1, v0, :cond_6

    .line 155
    .line 156
    :goto_3
    return-object v0

    .line 157
    :cond_6
    return-object v2
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
