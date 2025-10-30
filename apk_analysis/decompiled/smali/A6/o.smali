.class public abstract LA6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LN6/d;

    .line 2
    .line 3
    invoke-direct {v0}, LN6/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LA6/a;->a:LA6/a;

    .line 7
    .line 8
    const-class v2, LA6/o;

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, LN6/d;->a(Ljava/lang/Class;LL6/d;)LM6/a;

    .line 11
    .line 12
    .line 13
    const-class v2, LA6/b;

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, LN6/d;->a(Ljava/lang/Class;LL6/d;)LM6/a;

    .line 16
    .line 17
    .line 18
    new-instance v1, Lo1/f;

    .line 19
    .line 20
    const/16 v2, 0xc

    .line 21
    .line 22
    invoke-direct {v1, v2, v0}, Lo1/f;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, LA6/o;->a:Lo1/f;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
