.class public final enum Lco/notix/p8;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lco/notix/p8;

.field public static final enum c:Lco/notix/p8;

.field public static final enum d:Lco/notix/p8;

.field public static final synthetic e:[Lco/notix/p8;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lco/notix/p8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "close"

    .line 5
    .line 6
    const-string v3, "X"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lco/notix/p8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lco/notix/p8;->b:Lco/notix/p8;

    .line 12
    .line 13
    new-instance v2, Lco/notix/p8;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const-string v4, "by_click"

    .line 17
    .line 18
    const-string v5, "CLICK"

    .line 19
    .line 20
    invoke-direct {v2, v5, v3, v4}, Lco/notix/p8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Lco/notix/p8;->c:Lco/notix/p8;

    .line 24
    .line 25
    new-instance v4, Lco/notix/p8;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const-string v6, "error"

    .line 29
    .line 30
    const-string v7, "ERROR"

    .line 31
    .line 32
    invoke-direct {v4, v7, v5, v6}, Lco/notix/p8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v4, Lco/notix/p8;->d:Lco/notix/p8;

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    new-array v6, v6, [Lco/notix/p8;

    .line 39
    .line 40
    aput-object v0, v6, v1

    .line 41
    .line 42
    aput-object v2, v6, v3

    .line 43
    .line 44
    aput-object v4, v6, v5

    .line 45
    .line 46
    sput-object v6, Lco/notix/p8;->e:[Lco/notix/p8;

    .line 47
    .line 48
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/notix/p8;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/notix/p8;
    .locals 1

    const-class v0, Lco/notix/p8;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/notix/p8;

    return-object p0
.end method

.method public static values()[Lco/notix/p8;
    .locals 1

    sget-object v0, Lco/notix/p8;->e:[Lco/notix/p8;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/notix/p8;

    return-object v0
.end method
