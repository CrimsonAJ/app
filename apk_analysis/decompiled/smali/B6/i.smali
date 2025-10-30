.class public final LB6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL6/d;


# static fields
.field public static final a:LB6/i;

.field public static final b:LL6/c;

.field public static final c:LL6/c;

.field public static final d:LL6/c;

.field public static final e:LL6/c;

.field public static final f:LL6/c;

.field public static final g:LL6/c;

.field public static final h:LL6/c;

.field public static final i:LL6/c;

.field public static final j:LL6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LB6/i;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LB6/i;->a:LB6/i;

    .line 7
    .line 8
    const-string v0, "arch"

    .line 9
    .line 10
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LB6/i;->b:LL6/c;

    .line 15
    .line 16
    const-string v0, "model"

    .line 17
    .line 18
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, LB6/i;->c:LL6/c;

    .line 23
    .line 24
    const-string v0, "cores"

    .line 25
    .line 26
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, LB6/i;->d:LL6/c;

    .line 31
    .line 32
    const-string v0, "ram"

    .line 33
    .line 34
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, LB6/i;->e:LL6/c;

    .line 39
    .line 40
    const-string v0, "diskSpace"

    .line 41
    .line 42
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, LB6/i;->f:LL6/c;

    .line 47
    .line 48
    const-string v0, "simulator"

    .line 49
    .line 50
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, LB6/i;->g:LL6/c;

    .line 55
    .line 56
    const-string v0, "state"

    .line 57
    .line 58
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, LB6/i;->h:LL6/c;

    .line 63
    .line 64
    const-string v0, "manufacturer"

    .line 65
    .line 66
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sput-object v0, LB6/i;->i:LL6/c;

    .line 71
    .line 72
    const-string v0, "modelClass"

    .line 73
    .line 74
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, LB6/i;->j:LL6/c;

    .line 79
    .line 80
    return-void
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
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, LB6/w0;

    .line 2
    .line 3
    check-cast p2, LL6/e;

    .line 4
    .line 5
    check-cast p1, LB6/N;

    .line 6
    .line 7
    iget v0, p1, LB6/N;->a:I

    .line 8
    .line 9
    sget-object v1, LB6/i;->b:LL6/c;

    .line 10
    .line 11
    invoke-interface {p2, v1, v0}, LL6/e;->e(LL6/c;I)LL6/e;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, LB6/N;->b:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v1, LB6/i;->c:LL6/c;

    .line 17
    .line 18
    invoke-interface {p2, v1, v0}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 19
    .line 20
    .line 21
    sget-object v0, LB6/i;->d:LL6/c;

    .line 22
    .line 23
    iget v1, p1, LB6/N;->c:I

    .line 24
    .line 25
    invoke-interface {p2, v0, v1}, LL6/e;->e(LL6/c;I)LL6/e;

    .line 26
    .line 27
    .line 28
    sget-object v0, LB6/i;->e:LL6/c;

    .line 29
    .line 30
    iget-wide v1, p1, LB6/N;->d:J

    .line 31
    .line 32
    invoke-interface {p2, v0, v1, v2}, LL6/e;->f(LL6/c;J)LL6/e;

    .line 33
    .line 34
    .line 35
    sget-object v0, LB6/i;->f:LL6/c;

    .line 36
    .line 37
    iget-wide v1, p1, LB6/N;->e:J

    .line 38
    .line 39
    invoke-interface {p2, v0, v1, v2}, LL6/e;->f(LL6/c;J)LL6/e;

    .line 40
    .line 41
    .line 42
    sget-object v0, LB6/i;->g:LL6/c;

    .line 43
    .line 44
    iget-boolean v1, p1, LB6/N;->f:Z

    .line 45
    .line 46
    invoke-interface {p2, v0, v1}, LL6/e;->b(LL6/c;Z)LL6/e;

    .line 47
    .line 48
    .line 49
    sget-object v0, LB6/i;->h:LL6/c;

    .line 50
    .line 51
    iget v1, p1, LB6/N;->g:I

    .line 52
    .line 53
    invoke-interface {p2, v0, v1}, LL6/e;->e(LL6/c;I)LL6/e;

    .line 54
    .line 55
    .line 56
    sget-object v0, LB6/i;->i:LL6/c;

    .line 57
    .line 58
    iget-object v1, p1, LB6/N;->h:Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {p2, v0, v1}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 61
    .line 62
    .line 63
    sget-object v0, LB6/i;->j:LL6/c;

    .line 64
    .line 65
    iget-object p1, p1, LB6/N;->i:Ljava/lang/String;

    .line 66
    .line 67
    invoke-interface {p2, v0, p1}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 68
    .line 69
    .line 70
    return-void
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
