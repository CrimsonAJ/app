.class public final Lcom/anilab/data/model/response/PageDataResponseJsonAdapter;
.super Lo7/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lo7/k;"
    }
.end annotation


# instance fields
.field public final a:Lk4/E;

.field public final b:Lo7/k;

.field public final c:Lo7/k;


# direct methods
.method public constructor <init>(Lo7/y;[Ljava/lang/reflect/Type;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "moshi"

    .line 4
    .line 5
    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v2, "types"

    .line 9
    .line 10
    invoke-static {p2, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    array-length v2, p2

    .line 17
    if-ne v2, v1, :cond_0

    .line 18
    .line 19
    const-string v2, "limit"

    .line 20
    .line 21
    const-string v3, "total_pages"

    .line 22
    .line 23
    const-string v4, "page"

    .line 24
    .line 25
    const-string v5, "count"

    .line 26
    .line 27
    const-string v6, "rows"

    .line 28
    .line 29
    filled-new-array {v4, v2, v3, v5, v6}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Lk4/E;->o([Ljava/lang/String;)Lk4/E;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput-object v2, p0, Lcom/anilab/data/model/response/PageDataResponseJsonAdapter;->a:Lk4/E;

    .line 38
    .line 39
    sget-object v2, LB7/v;->a:LB7/v;

    .line 40
    .line 41
    const-class v3, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p1, v3, v2, v4}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iput-object v3, p0, Lcom/anilab/data/model/response/PageDataResponseJsonAdapter;->b:Lo7/k;

    .line 48
    .line 49
    aget-object p2, p2, v0

    .line 50
    .line 51
    new-array v1, v1, [Ljava/lang/reflect/Type;

    .line 52
    .line 53
    aput-object p2, v1, v0

    .line 54
    .line 55
    invoke-static {v1}, Lo7/D;->f([Ljava/lang/reflect/Type;)Lp7/c;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const-string v0, "result"

    .line 60
    .line 61
    invoke-virtual {p1, p2, v2, v0}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lcom/anilab/data/model/response/PageDataResponseJsonAdapter;->c:Lo7/k;

    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v0, "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received "

    .line 71
    .line 72
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    array-length p2, p2

    .line 76
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p2
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


# virtual methods
.method public final b(Lo7/n;)Ljava/lang/Object;
    .locals 8

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
    move-object v2, v0

    .line 11
    move-object v3, v2

    .line 12
    move-object v4, v3

    .line 13
    move-object v5, v4

    .line 14
    move-object v6, v5

    .line 15
    :goto_0
    invoke-virtual {p1}, Lo7/n;->F()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_6

    .line 20
    .line 21
    iget-object v0, p0, Lcom/anilab/data/model/response/PageDataResponseJsonAdapter;->a:Lk4/E;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lo7/n;->h0(Lk4/E;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, -0x1

    .line 28
    if-eq v0, v1, :cond_5

    .line 29
    .line 30
    iget-object v1, p0, Lcom/anilab/data/model/response/PageDataResponseJsonAdapter;->b:Lo7/k;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    if-eq v0, v7, :cond_3

    .line 36
    .line 37
    const/4 v7, 0x2

    .line 38
    if-eq v0, v7, :cond_2

    .line 39
    .line 40
    const/4 v7, 0x3

    .line 41
    if-eq v0, v7, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    if-eq v0, v1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object v0, p0, Lcom/anilab/data/model/response/PageDataResponseJsonAdapter;->c:Lo7/k;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v6, v0

    .line 54
    check-cast v6, Ljava/util/List;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v5, v0

    .line 62
    check-cast v5, Ljava/lang/Integer;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v4, v0

    .line 70
    check-cast v4, Ljava/lang/Integer;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    move-object v3, v0

    .line 78
    check-cast v3, Ljava/lang/Integer;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-virtual {v1, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object v2, v0

    .line 86
    check-cast v2, Ljava/lang/Integer;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    invoke-virtual {p1}, Lo7/n;->i0()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lo7/n;->j0()V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_6
    invoke-virtual {p1}, Lo7/n;->s()V

    .line 97
    .line 98
    .line 99
    new-instance v1, Lcom/anilab/data/model/response/PageDataResponse;

    .line 100
    .line 101
    invoke-direct/range {v1 .. v6}, Lcom/anilab/data/model/response/PageDataResponse;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V

    .line 102
    .line 103
    .line 104
    return-object v1
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

.method public final e(Lo7/q;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Lcom/anilab/data/model/response/PageDataResponse;

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
    const-string v0, "page"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/anilab/data/model/response/PageDataResponseJsonAdapter;->b:Lo7/k;

    .line 19
    .line 20
    iget-object v1, p2, Lcom/anilab/data/model/response/PageDataResponse;->a:Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const-string v1, "limit"

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 28
    .line 29
    .line 30
    iget-object v1, p2, Lcom/anilab/data/model/response/PageDataResponse;->b:Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "total_pages"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 38
    .line 39
    .line 40
    iget-object v1, p2, Lcom/anilab/data/model/response/PageDataResponse;->c:Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-string v1, "count"

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 48
    .line 49
    .line 50
    iget-object v1, p2, Lcom/anilab/data/model/response/PageDataResponse;->d:Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const-string v0, "rows"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/anilab/data/model/response/PageDataResponseJsonAdapter;->c:Lo7/k;

    .line 61
    .line 62
    iget-object p2, p2, Lcom/anilab/data/model/response/PageDataResponse;->e:Ljava/util/List;

    .line 63
    .line 64
    invoke-virtual {v0, p1, p2}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lo7/q;->g()Lo7/p;

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 72
    .line 73
    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    .line 74
    .line 75
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
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
    const/16 v0, 0x26

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(PageDataResponse)"

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
