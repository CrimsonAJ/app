.class public final Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;
.super Lo7/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo7/k;"
    }
.end annotation


# instance fields
.field public final a:Lk4/E;

.field public final b:Lo7/k;

.field public final c:Lo7/k;

.field public final d:Lo7/k;

.field public final e:Lo7/k;

.field public final f:Lo7/k;


# direct methods
.method public constructor <init>(Lo7/y;)V
    .locals 10

    .line 1
    const-string v0, "moshi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v8, "updated_at"

    .line 10
    .line 11
    const-string v9, "movie"

    .line 12
    .line 13
    const-string v1, "id"

    .line 14
    .line 15
    const-string v2, "user_id"

    .line 16
    .line 17
    const-string v3, "movie_id"

    .line 18
    .line 19
    const-string v4, "episode_id"

    .line 20
    .line 21
    const-string v5, "episode_number"

    .line 22
    .line 23
    const-string v6, "time"

    .line 24
    .line 25
    const-string v7, "percent"

    .line 26
    .line 27
    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lk4/E;->o([Ljava/lang/String;)Lk4/E;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->a:Lk4/E;

    .line 36
    .line 37
    sget-object v0, LB7/v;->a:LB7/v;

    .line 38
    .line 39
    const-string v1, "id"

    .line 40
    .line 41
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->b:Lo7/k;

    .line 48
    .line 49
    const-string v1, "userId"

    .line 50
    .line 51
    const-class v2, Ljava/lang/Long;

    .line 52
    .line 53
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->c:Lo7/k;

    .line 58
    .line 59
    const-string v1, "number"

    .line 60
    .line 61
    const-class v2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->d:Lo7/k;

    .line 68
    .line 69
    const-string v1, "percent"

    .line 70
    .line 71
    const-class v2, Ljava/lang/Float;

    .line 72
    .line 73
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->e:Lo7/k;

    .line 78
    .line 79
    const-string v1, "movie"

    .line 80
    .line 81
    const-class v2, Lcom/anilab/data/model/response/MovieResponse;

    .line 82
    .line 83
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->f:Lo7/k;

    .line 88
    .line 89
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method


# virtual methods
.method public final b(Lo7/n;)Ljava/lang/Object;
    .locals 12

    .line 1
    const-string v0, "reader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lo7/n;->d()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move-object v4, v0

    .line 11
    move-object v5, v4

    .line 12
    move-object v6, v5

    .line 13
    move-object v7, v6

    .line 14
    move-object v8, v7

    .line 15
    move-object v9, v8

    .line 16
    move-object v10, v9

    .line 17
    move-object v11, v10

    .line 18
    :goto_0
    invoke-virtual {p1}, Lo7/n;->F()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const-string v2, "id"

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->a:Lk4/E;

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lo7/n;->h0(Lk4/E;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v3, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->c:Lo7/k;

    .line 33
    .line 34
    packed-switch v1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_0
    iget-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->f:Lo7/k;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    move-object v11, v1

    .line 45
    check-cast v11, Lcom/anilab/data/model/response/MovieResponse;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_1
    invoke-virtual {v3, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    move-object v10, v1

    .line 53
    check-cast v10, Ljava/lang/Long;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_2
    iget-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->e:Lo7/k;

    .line 57
    .line 58
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    move-object v9, v1

    .line 63
    check-cast v9, Ljava/lang/Float;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_3
    invoke-virtual {v3, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    move-object v8, v1

    .line 71
    check-cast v8, Ljava/lang/Long;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_4
    iget-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->d:Lo7/k;

    .line 75
    .line 76
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    move-object v7, v1

    .line 81
    check-cast v7, Ljava/lang/Integer;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :pswitch_5
    invoke-virtual {v3, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object v6, v1

    .line 89
    check-cast v6, Ljava/lang/Long;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_6
    invoke-virtual {v3, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    move-object v5, v1

    .line 97
    check-cast v5, Ljava/lang/Long;

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :pswitch_7
    invoke-virtual {v3, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    move-object v4, v1

    .line 105
    check-cast v4, Ljava/lang/Long;

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :pswitch_8
    iget-object v0, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->b:Lo7/k;

    .line 109
    .line 110
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Ljava/lang/Long;

    .line 115
    .line 116
    if-eqz v0, :cond_0

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-static {v2, v2, p1}, Lp7/e;->j(Ljava/lang/String;Ljava/lang/String;Lo7/n;)LA7/b;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    throw p1

    .line 124
    :pswitch_9
    invoke-virtual {p1}, Lo7/n;->i0()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lo7/n;->j0()V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_1
    invoke-virtual {p1}, Lo7/n;->s()V

    .line 132
    .line 133
    .line 134
    new-instance v1, Lcom/anilab/data/model/response/ContinueWatchRowResponse;

    .line 135
    .line 136
    if-eqz v0, :cond_2

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide v2

    .line 142
    invoke-direct/range {v1 .. v11}, Lcom/anilab/data/model/response/ContinueWatchRowResponse;-><init>(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Long;Lcom/anilab/data/model/response/MovieResponse;)V

    .line 143
    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_2
    invoke-static {v2, v2, p1}, Lp7/e;->e(Ljava/lang/String;Ljava/lang/String;Lo7/n;)LA7/b;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    throw p1

    .line 151
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final e(Lo7/q;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lcom/anilab/data/model/response/ContinueWatchRowResponse;

    .line 2
    .line 3
    const-string v0, "writer"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lo7/q;->d()Lo7/p;

    .line 11
    .line 12
    .line 13
    const-string v0, "id"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 16
    .line 17
    .line 18
    iget-wide v0, p2, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->a:J

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->b:Lo7/k;

    .line 25
    .line 26
    invoke-virtual {v1, p1, v0}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "user_id"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->c:Lo7/k;

    .line 35
    .line 36
    iget-object v1, p2, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->b:Ljava/lang/Long;

    .line 37
    .line 38
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const-string v1, "movie_id"

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 44
    .line 45
    .line 46
    iget-object v1, p2, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->c:Ljava/lang/Long;

    .line 47
    .line 48
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const-string v1, "episode_id"

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 54
    .line 55
    .line 56
    iget-object v1, p2, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->d:Ljava/lang/Long;

    .line 57
    .line 58
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const-string v1, "episode_number"

    .line 62
    .line 63
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->d:Lo7/k;

    .line 67
    .line 68
    iget-object v2, p2, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->e:Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v1, p1, v2}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const-string v1, "time"

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 76
    .line 77
    .line 78
    iget-object v1, p2, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->f:Ljava/lang/Long;

    .line 79
    .line 80
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const-string v1, "percent"

    .line 84
    .line 85
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->e:Lo7/k;

    .line 89
    .line 90
    iget-object v2, p2, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->g:Ljava/lang/Float;

    .line 91
    .line 92
    invoke-virtual {v1, p1, v2}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const-string v1, "updated_at"

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 98
    .line 99
    .line 100
    iget-object v1, p2, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->h:Ljava/lang/Long;

    .line 101
    .line 102
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    const-string v0, "movie"

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/anilab/data/model/response/ContinueWatchRowResponseJsonAdapter;->f:Lo7/k;

    .line 111
    .line 112
    iget-object p2, p2, Lcom/anilab/data/model/response/ContinueWatchRowResponse;->i:Lcom/anilab/data/model/response/MovieResponse;

    .line 113
    .line 114
    invoke-virtual {v0, p1, p2}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lo7/q;->g()Lo7/p;

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 122
    .line 123
    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    .line 124
    .line 125
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p1
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(ContinueWatchRowResponse)"

    .line 4
    .line 5
    invoke-static {v0, v1}, LA0/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

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
