.class public abstract Lq4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LC4/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LH4/b;

    .line 7
    .line 8
    const/4 v2, 0x5

    .line 9
    invoke-direct {v1, v2}, LH4/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, LA1/g;

    .line 13
    .line 14
    const-string v3, "Auth.GOOGLE_SIGN_IN_API"

    .line 15
    .line 16
    invoke-direct {v2, v3, v1, v0}, LA1/g;-><init>(Ljava/lang/String;LZ0/a;LC4/d;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lq4/a;->a:LA1/g;

    .line 20
    .line 21
    return-void
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
