.class public final enum Lco/notix/ql;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lco/notix/ql;

.field public static final enum c:Lco/notix/ql;

.field public static final enum d:Lco/notix/ql;

.field public static final enum e:Lco/notix/ql;

.field public static final synthetic f:[Lco/notix/ql;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lco/notix/ql;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "none"

    .line 5
    .line 6
    const-string v3, "NONE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lco/notix/ql;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lco/notix/ql;->b:Lco/notix/ql;

    .line 12
    .line 13
    new-instance v2, Lco/notix/ql;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const-string v4, "e"

    .line 17
    .line 18
    const-string v5, "ERROR"

    .line 19
    .line 20
    invoke-direct {v2, v5, v3, v4}, Lco/notix/ql;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Lco/notix/ql;->c:Lco/notix/ql;

    .line 24
    .line 25
    new-instance v4, Lco/notix/ql;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const-string v6, "i"

    .line 29
    .line 30
    const-string v7, "IMPORTANT"

    .line 31
    .line 32
    invoke-direct {v4, v7, v5, v6}, Lco/notix/ql;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v4, Lco/notix/ql;->d:Lco/notix/ql;

    .line 36
    .line 37
    new-instance v6, Lco/notix/ql;

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const-string v8, "v"

    .line 41
    .line 42
    const-string v9, "VERBOSE"

    .line 43
    .line 44
    invoke-direct {v6, v9, v7, v8}, Lco/notix/ql;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v6, Lco/notix/ql;->e:Lco/notix/ql;

    .line 48
    .line 49
    const/4 v8, 0x4

    .line 50
    new-array v8, v8, [Lco/notix/ql;

    .line 51
    .line 52
    aput-object v0, v8, v1

    .line 53
    .line 54
    aput-object v2, v8, v3

    .line 55
    .line 56
    aput-object v4, v8, v5

    .line 57
    .line 58
    aput-object v6, v8, v7

    .line 59
    .line 60
    sput-object v8, Lco/notix/ql;->f:[Lco/notix/ql;

    .line 61
    .line 62
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/notix/ql;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/notix/ql;
    .locals 1

    const-class v0, Lco/notix/ql;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/notix/ql;

    return-object p0
.end method

.method public static values()[Lco/notix/ql;
    .locals 1

    sget-object v0, Lco/notix/ql;->f:[Lco/notix/ql;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/notix/ql;

    return-object v0
.end method
